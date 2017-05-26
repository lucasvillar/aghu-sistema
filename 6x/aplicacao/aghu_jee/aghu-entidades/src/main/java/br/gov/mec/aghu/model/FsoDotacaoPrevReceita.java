package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FsoDotacaoPrevReceita generated by hbm2java
 */
@Entity
@Table(name = "FSO_DOTACAO_PREV_RECEITAS", schema = "AGH")
public class FsoDotacaoPrevReceita extends BaseEntityId<FsoDotacaoPrevReceitaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2613212691646114739L;
	private FsoDotacaoPrevReceitaId id;
	private Integer version;
	private CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano;
	private FsoExercicioOrcamentario fsoExercicioOrcamentario;
	private FsoFontesRecursoFinanc fsoFontesRecursoFinanc;
	private RapServidores rapServidores;
	private Double valor;
	private Date criadoEm;
	private Date alteradoEm;

	public FsoDotacaoPrevReceita() {
	}

	public FsoDotacaoPrevReceita(FsoDotacaoPrevReceitaId id, CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano,
			FsoExercicioOrcamentario fsoExercicioOrcamentario, FsoFontesRecursoFinanc fsoFontesRecursoFinanc,
			RapServidores rapServidores, Date criadoEm) {
		this.id = id;
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
		this.fsoExercicioOrcamentario = fsoExercicioOrcamentario;
		this.fsoFontesRecursoFinanc = fsoFontesRecursoFinanc;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	public FsoDotacaoPrevReceita(FsoDotacaoPrevReceitaId id, CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano,
			FsoExercicioOrcamentario fsoExercicioOrcamentario, FsoFontesRecursoFinanc fsoFontesRecursoFinanc,
			RapServidores rapServidores, Double valor, Date criadoEm, Date alteradoEm) {
		this.id = id;
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
		this.fsoExercicioOrcamentario = fsoExercicioOrcamentario;
		this.fsoFontesRecursoFinanc = fsoFontesRecursoFinanc;
		this.rapServidores = rapServidores;
		this.valor = valor;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "gnpTabCodigo", column = @Column(name = "GNP_TAB_CODIGO", nullable = false)),
			@AttributeOverride(name = "gnpCodigo", column = @Column(name = "GNP_CODIGO", nullable = false)),
			@AttributeOverride(name = "exoExercicio", column = @Column(name = "EXO_EXERCICIO", nullable = false, length = 29)),
			@AttributeOverride(name = "frfCodigo", column = @Column(name = "FRF_CODIGO", nullable = false)) })
	public FsoDotacaoPrevReceitaId getId() {
		return this.id;
	}

	public void setId(FsoDotacaoPrevReceitaId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "GNP_TAB_CODIGO", referencedColumnName = "TAB_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "GNP_CODIGO", referencedColumnName = "CODIGO", nullable = false, insertable = false, updatable = false) })
	public CtbGrupoNaturezaPlano getCtbGrupoNaturezaPlano() {
		return this.ctbGrupoNaturezaPlano;
	}

	public void setCtbGrupoNaturezaPlano(CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano) {
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXO_EXERCICIO", nullable = false, insertable = false, updatable = false)
	public FsoExercicioOrcamentario getFsoExercicioOrcamentario() {
		return this.fsoExercicioOrcamentario;
	}

	public void setFsoExercicioOrcamentario(FsoExercicioOrcamentario fsoExercicioOrcamentario) {
		this.fsoExercicioOrcamentario = fsoExercicioOrcamentario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FRF_CODIGO", nullable = false, insertable = false, updatable = false)
	public FsoFontesRecursoFinanc getFsoFontesRecursoFinanc() {
		return this.fsoFontesRecursoFinanc;
	}

	public void setFsoFontesRecursoFinanc(FsoFontesRecursoFinanc fsoFontesRecursoFinanc) {
		this.fsoFontesRecursoFinanc = fsoFontesRecursoFinanc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "VALOR", precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		CTB_GRUPO_NATUREZA_PLANOS("ctbGrupoNaturezaPlano"),
		FSO_EXERCICIO_ORCAMENTARIO("fsoExercicioOrcamentario"),
		FSO_FONTES_RECURSO_FINANC("fsoFontesRecursoFinanc"),
		RAP_SERVIDORES("rapServidores"),
		VALOR("valor"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FsoDotacaoPrevReceita)) {
			return false;
		}
		FsoDotacaoPrevReceita other = (FsoDotacaoPrevReceita) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
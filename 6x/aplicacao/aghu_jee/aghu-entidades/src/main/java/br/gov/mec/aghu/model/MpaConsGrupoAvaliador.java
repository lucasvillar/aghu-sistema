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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpaConsGrupoAvaliador generated by hbm2java
 */
@Entity
@Table(name = "MPA_CONS_GRUPO_AVALIADORES", schema = "AGH")
public class MpaConsGrupoAvaliador extends BaseEntityId<MpaConsGrupoAvaliadorId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6793619889945774710L;
	private MpaConsGrupoAvaliadorId id;
	private Integer version;
	private RapConselhosProfissionais rapConselhosProfissionais;
	private MpaGrupoAvalProtocolo mpaGrupoAvalProtocolo;
	private RapServidores rapServidores;
	private Date criadoEm;
	private String indSituacao;

	public MpaConsGrupoAvaliador() {
	}

	public MpaConsGrupoAvaliador(MpaConsGrupoAvaliadorId id, RapConselhosProfissionais rapConselhosProfissionais,
			MpaGrupoAvalProtocolo mpaGrupoAvalProtocolo, RapServidores rapServidores, Date criadoEm, String indSituacao) {
		this.id = id;
		this.rapConselhosProfissionais = rapConselhosProfissionais;
		this.mpaGrupoAvalProtocolo = mpaGrupoAvalProtocolo;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "gapSeq", column = @Column(name = "GAP_SEQ", nullable = false)),
			@AttributeOverride(name = "cprCodigo", column = @Column(name = "CPR_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 17, scale = 17)) })
	public MpaConsGrupoAvaliadorId getId() {
		return this.id;
	}

	public void setId(MpaConsGrupoAvaliadorId id) {
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
	@JoinColumn(name = "CPR_CODIGO", nullable = false, insertable = false, updatable = false)
	public RapConselhosProfissionais getRapConselhosProfissionais() {
		return this.rapConselhosProfissionais;
	}

	public void setRapConselhosProfissionais(RapConselhosProfissionais rapConselhosProfissionais) {
		this.rapConselhosProfissionais = rapConselhosProfissionais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GAP_SEQ", nullable = false, insertable = false, updatable = false)
	public MpaGrupoAvalProtocolo getMpaGrupoAvalProtocolo() {
		return this.mpaGrupoAvalProtocolo;
	}

	public void setMpaGrupoAvalProtocolo(MpaGrupoAvalProtocolo mpaGrupoAvalProtocolo) {
		this.mpaGrupoAvalProtocolo = mpaGrupoAvalProtocolo;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_CONSELHOS_PROFISSIONAIS("rapConselhosProfissionais"),
		MPA_GRUPO_AVAL_PROTOCOLOS("mpaGrupoAvalProtocolo"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao");

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
		if (!(obj instanceof MpaConsGrupoAvaliador)) {
			return false;
		}
		MpaConsGrupoAvaliador other = (MpaConsGrupoAvaliador) obj;
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
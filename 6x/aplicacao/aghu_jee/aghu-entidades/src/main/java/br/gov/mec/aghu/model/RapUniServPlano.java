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
 * RapUniServPlano generated by hbm2java
 */
@Entity
@Table(name = "RAP_UNI_SERV_PLANOS", schema = "AGH")
public class RapUniServPlano extends BaseEntityId<RapUniServPlanoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8980999608700940592L;
	private RapUniServPlanoId id;
	private Integer version;
	private RapServidores rapServidoresByRapSplSerFk2;
	private RapUniServAdesao rapUniServAdesao;
	private RapServidores rapServidoresByRapSplSerFk1;
	private Date dtFim;
	private String tipo;
	private Long nroCarteira;
	private Double valor;
	private Date criadoEm;
	private Date alteradoEm;

	public RapUniServPlano() {
	}

	public RapUniServPlano(RapUniServPlanoId id, RapUniServAdesao rapUniServAdesao, RapServidores rapServidoresByRapSplSerFk1,
			Date criadoEm) {
		this.id = id;
		this.rapUniServAdesao = rapUniServAdesao;
		this.rapServidoresByRapSplSerFk1 = rapServidoresByRapSplSerFk1;
		this.criadoEm = criadoEm;
	}

	public RapUniServPlano(RapUniServPlanoId id, RapServidores rapServidoresByRapSplSerFk2, RapUniServAdesao rapUniServAdesao,
			RapServidores rapServidoresByRapSplSerFk1, Date dtFim, String tipo, Long nroCarteira, Double valor, Date criadoEm,
			Date alteradoEm) {
		this.id = id;
		this.rapServidoresByRapSplSerFk2 = rapServidoresByRapSplSerFk2;
		this.rapUniServAdesao = rapUniServAdesao;
		this.rapServidoresByRapSplSerFk1 = rapServidoresByRapSplSerFk1;
		this.dtFim = dtFim;
		this.tipo = tipo;
		this.nroCarteira = nroCarteira;
		this.valor = valor;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "sadSerMatricula", column = @Column(name = "SAD_SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "sadSerVinCodigo", column = @Column(name = "SAD_SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "sadSeqp", column = @Column(name = "SAD_SEQP", nullable = false)),
			@AttributeOverride(name = "dtInicio", column = @Column(name = "DT_INICIO", nullable = false, length = 29)) })
	public RapUniServPlanoId getId() {
		return this.id;
	}

	public void setId(RapUniServPlanoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapSplSerFk2() {
		return this.rapServidoresByRapSplSerFk2;
	}

	public void setRapServidoresByRapSplSerFk2(RapServidores rapServidoresByRapSplSerFk2) {
		this.rapServidoresByRapSplSerFk2 = rapServidoresByRapSplSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SAD_SER_MATRICULA", referencedColumnName = "SER_MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SAD_SER_VIN_CODIGO", referencedColumnName = "SER_VIN_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SAD_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public RapUniServAdesao getRapUniServAdesao() {
		return this.rapUniServAdesao;
	}

	public void setRapUniServAdesao(RapUniServAdesao rapUniServAdesao) {
		this.rapUniServAdesao = rapUniServAdesao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapSplSerFk1() {
		return this.rapServidoresByRapSplSerFk1;
	}

	public void setRapServidoresByRapSplSerFk1(RapServidores rapServidoresByRapSplSerFk1) {
		this.rapServidoresByRapSplSerFk1 = rapServidoresByRapSplSerFk1;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "TIPO", length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "NRO_CARTEIRA")
	public Long getNroCarteira() {
		return this.nroCarteira;
	}

	public void setNroCarteira(Long nroCarteira) {
		this.nroCarteira = nroCarteira;
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
		RAP_SERVIDORES_BY_RAP_SPL_SER_FK2("rapServidoresByRapSplSerFk2"),
		RAP_UNI_SERV_ADESOES("rapUniServAdesao"),
		RAP_SERVIDORES_BY_RAP_SPL_SER_FK1("rapServidoresByRapSplSerFk1"),
		DT_FIM("dtFim"),
		TIPO("tipo"),
		NRO_CARTEIRA("nroCarteira"),
		VALOR("valor"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		DT_INICIO("id.dtInicio"),
		SAD_SER_MATRICULA("id.sadSerMatricula"),
	    SAD_SER_VIN_CODIGO("id.sadSerVinCodigo")
		;

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
		if (!(obj instanceof RapUniServPlano)) {
			return false;
		}
		RapUniServPlano other = (RapUniServPlano) obj;
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
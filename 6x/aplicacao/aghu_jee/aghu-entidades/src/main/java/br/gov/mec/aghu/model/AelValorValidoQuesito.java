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
 * AelValorValidoQuesito generated by hbm2java
 */
@Entity
@Table(name = "AEL_VALOR_VALIDO_QUESITOS", schema = "AGH")
public class AelValorValidoQuesito extends BaseEntityId<AelValorValidoQuesitoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6694299367055528945L;
	private AelValorValidoQuesitoId id;
	private Integer version;
	private AelProjetoProtQuesito aelProjetoProtQuesito;
	private RapServidores rapServidores;
	private String valorAbreviado;
	private String valorSignificado;
	private String indSituacao;
	private Date criadoEm;

	public AelValorValidoQuesito() {
	}

	public AelValorValidoQuesito(AelValorValidoQuesitoId id, AelProjetoProtQuesito aelProjetoProtQuesito,
			RapServidores rapServidores, String valorAbreviado, String valorSignificado, String indSituacao, Date criadoEm) {
		this.id = id;
		this.aelProjetoProtQuesito = aelProjetoProtQuesito;
		this.rapServidores = rapServidores;
		this.valorAbreviado = valorAbreviado;
		this.valorSignificado = valorSignificado;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ppqPpoPjqSeq", column = @Column(name = "PPQ_PPO_PJQ_SEQ", nullable = false)),
			@AttributeOverride(name = "ppqPpoSeqp", column = @Column(name = "PPQ_PPO_SEQP", nullable = false)),
			@AttributeOverride(name = "ppqSeqp", column = @Column(name = "PPQ_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelValorValidoQuesitoId getId() {
		return this.id;
	}

	public void setId(AelValorValidoQuesitoId id) {
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
			@JoinColumn(name = "PPQ_PPO_PJQ_SEQ", referencedColumnName = "PPO_PJQ_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PPQ_PPO_SEQP", referencedColumnName = "PPO_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PPQ_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public AelProjetoProtQuesito getAelProjetoProtQuesito() {
		return this.aelProjetoProtQuesito;
	}

	public void setAelProjetoProtQuesito(AelProjetoProtQuesito aelProjetoProtQuesito) {
		this.aelProjetoProtQuesito = aelProjetoProtQuesito;
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

	@Column(name = "VALOR_ABREVIADO", nullable = false, length = 30)
	@Length(max = 30)
	public String getValorAbreviado() {
		return this.valorAbreviado;
	}

	public void setValorAbreviado(String valorAbreviado) {
		this.valorAbreviado = valorAbreviado;
	}

	@Column(name = "VALOR_SIGNIFICADO", nullable = false, length = 30)
	@Length(max = 30)
	public String getValorSignificado() {
		return this.valorSignificado;
	}

	public void setValorSignificado(String valorSignificado) {
		this.valorSignificado = valorSignificado;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		AEL_PROJETO_PROT_QUESITOS("aelProjetoProtQuesito"),
		RAP_SERVIDORES("rapServidores"),
		VALOR_ABREVIADO("valorAbreviado"),
		VALOR_SIGNIFICADO("valorSignificado"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof AelValorValidoQuesito)) {
			return false;
		}
		AelValorValidoQuesito other = (AelValorValidoQuesito) obj;
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
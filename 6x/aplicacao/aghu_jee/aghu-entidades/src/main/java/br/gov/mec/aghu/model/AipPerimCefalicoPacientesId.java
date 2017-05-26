package br.gov.mec.aghu.model;

// Generated 22/02/2010 19:17:07 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AipPerimCefalicoPacientesId generated by hbm2java
 */
@Embeddable
public class AipPerimCefalicoPacientesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3918435173872501708L;
	private Integer pacCodigo;
	private Short seqp;

	public AipPerimCefalicoPacientesId() {
	}

	public AipPerimCefalicoPacientesId(Integer pacCodigo, Short seqp) {
		this.pacCodigo = pacCodigo;
		this.seqp = seqp;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SEQP", nullable = false, precision = 4, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AipPerimCefalicoPacientesId)) {
			return false;
		}
		AipPerimCefalicoPacientesId castOther = (AipPerimCefalicoPacientesId) other;

		return (this.getPacCodigo() == castOther.getPacCodigo())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPacCodigo();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciAgrupLinhaExportacaoId generated by hbm2java
 */
@Embeddable
public class MciAgrupLinhaExportacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -274102801798532052L;
	private Short aucTauSeq;
	private Short aucSeqp;
	private Short ledSeq;

	public MciAgrupLinhaExportacaoId() {
	}

	public MciAgrupLinhaExportacaoId(Short aucTauSeq, Short aucSeqp, Short ledSeq) {
		this.aucTauSeq = aucTauSeq;
		this.aucSeqp = aucSeqp;
		this.ledSeq = ledSeq;
	}

	@Column(name = "AUC_TAU_SEQ", nullable = false)
	public Short getAucTauSeq() {
		return this.aucTauSeq;
	}

	public void setAucTauSeq(Short aucTauSeq) {
		this.aucTauSeq = aucTauSeq;
	}

	@Column(name = "AUC_SEQP", nullable = false)
	public Short getAucSeqp() {
		return this.aucSeqp;
	}

	public void setAucSeqp(Short aucSeqp) {
		this.aucSeqp = aucSeqp;
	}

	@Column(name = "LED_SEQ", nullable = false)
	public Short getLedSeq() {
		return this.ledSeq;
	}

	public void setLedSeq(Short ledSeq) {
		this.ledSeq = ledSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getLedSeq());
		umHashCodeBuilder.append(this.getAucTauSeq());
		umHashCodeBuilder.append(this.getAucSeqp());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MciAgrupLinhaExportacaoId)) {
			return false;
		}
		MciAgrupLinhaExportacaoId other = (MciAgrupLinhaExportacaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getLedSeq(), other.getLedSeq());
		umEqualsBuilder.append(this.getAucTauSeq(), other.getAucTauSeq());
		umEqualsBuilder.append(this.getAucSeqp(), other.getAucSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
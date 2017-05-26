package br.gov.mec.aghu.model;

// Generated 22/07/2011 16:40:34 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * SceRefCodes generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "sceRcoSq1", sequenceName = "AGH.SCE_RCO_SQ1", allocationSize = 1)
@Table(name = "SCE_REF_CODES", schema = "AGH")
public class SceRefCodes extends BaseEntitySeq<Long> implements java.io.Serializable {
	
	private static final long serialVersionUID = -1207904111245504891L;
	private Long seq;
	private String rvLowValue;
	private String rvHighValue;
	private String rvAbbreviation;
	private String rvDomain;
	private String rvMeaning;
	private String rvType;

	public SceRefCodes() {
	}

	public SceRefCodes(final Long seq, final String rvLowValue, final String rvDomain) {
		this.seq = seq;
		this.rvLowValue = rvLowValue;
		this.rvDomain = rvDomain;
	}

	public SceRefCodes(final Long seq, final String rvLowValue, final String rvHighValue, final String rvAbbreviation, final String rvDomain, final String rvMeaning, final String rvType) {
		this.seq = seq;
		this.rvLowValue = rvLowValue;
		this.rvHighValue = rvHighValue;
		this.rvAbbreviation = rvAbbreviation;
		this.rvDomain = rvDomain;
		this.rvMeaning = rvMeaning;
		this.rvType = rvType;
	}
	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sceRcoSq1")
	@Id
	@Column(name = "SEQ", nullable = false)
	public Long getSeq() {
		return seq;
	}

	public void setSeq(final Long seq) {
		this.seq = seq;
	}

	@Column(name = "RV_LOW_VALUE", nullable = false, length = 240)
	@Length(max = 240)
	public String getRvLowValue() {
		return this.rvLowValue;
	}

	public void setRvLowValue(final String rvLowValue) {
		this.rvLowValue = rvLowValue;
	}

	@Column(name = "RV_HIGH_VALUE", length = 240)
	@Length(max = 240)
	public String getRvHighValue() {
		return this.rvHighValue;
	}

	public void setRvHighValue(final String rvHighValue) {
		this.rvHighValue = rvHighValue;
	}

	@Column(name = "RV_ABBREVIATION", length = 240)
	@Length(max = 240)
	public String getRvAbbreviation() {
		return this.rvAbbreviation;
	}

	public void setRvAbbreviation(final String rvAbbreviation) {
		this.rvAbbreviation = rvAbbreviation;
	}

	@Column(name = "RV_DOMAIN", nullable = false, length = 100)
	@Length(max = 100)
	public String getRvDomain() {
		return this.rvDomain;
	}

	public void setRvDomain(final String rvDomain) {
		this.rvDomain = rvDomain;
	}

	@Column(name = "RV_MEANING", length = 240)
	@Length(max = 240)
	public String getRvMeaning() {
		return this.rvMeaning;
	}

	public void setRvMeaning(final String rvMeaning) {
		this.rvMeaning = rvMeaning;
	}

	@Column(name = "RV_TYPE", length = 10)
	@Length(max = 10)
	public String getRvType() {
		return this.rvType;
	}

	public void setRvType(final String rvType) {
		this.rvType = rvType;
	}

	@Override
	public boolean equals(final Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof SceRefCodes)) {
			return false;
		}
		final SceRefCodes castOther = (SceRefCodes) other;

		return (this.getSeq() == castOther.getSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSeq() == null ? 0 : getSeq().hashCode());

		return result;
	}
	
	public enum Fields {
		SEQ("seq"),
		RV_LOW_VALUE("rvLowValue"), 
		RV_HIGH_VALUE("rvHighValue"), 
		RV_ABBREVIATION("rvAbbreviation"), 
		RV_DOMAIN("rvDomain"), 
		RV_MEANING("rvMeaning"), 
		RV_TYPE("rvType");

		private String fields;

		private Fields(final String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
}
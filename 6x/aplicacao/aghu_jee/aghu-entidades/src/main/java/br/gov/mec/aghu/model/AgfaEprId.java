package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AgfaEprId generated by hbm2java
 */
@Embeddable
public class AgfaEprId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5552695775672868137L;
	private String mshDate;
	private String mshId;
	private String obrAccNumber;
	private String pid05Id;
	private String eprStudyStatus;
	private String eprStatusHis;
	private String obr02ExamId;

	public AgfaEprId() {
	}

	public AgfaEprId(String mshDate, String mshId, String obrAccNumber, String pid05Id, String eprStudyStatus, String eprStatusHis,
			String obr02ExamId) {
		this.mshDate = mshDate;
		this.mshId = mshId;
		this.obrAccNumber = obrAccNumber;
		this.pid05Id = pid05Id;
		this.eprStudyStatus = eprStudyStatus;
		this.eprStatusHis = eprStatusHis;
		this.obr02ExamId = obr02ExamId;
	}

	@Column(name = "MSH_DATE", length = 26)
	@Length(max = 26)
	public String getMshDate() {
		return this.mshDate;
	}

	public void setMshDate(String mshDate) {
		this.mshDate = mshDate;
	}

	@Column(name = "MSH_ID", length = 10)
	@Length(max = 10)
	public String getMshId() {
		return this.mshId;
	}

	public void setMshId(String mshId) {
		this.mshId = mshId;
	}

	@Column(name = "OBR_ACC_NUMBER", length = 30)
	@Length(max = 30)
	public String getObrAccNumber() {
		return this.obrAccNumber;
	}

	public void setObrAccNumber(String obrAccNumber) {
		this.obrAccNumber = obrAccNumber;
	}

	@Column(name = "PID_05_ID", length = 48)
	@Length(max = 48)
	public String getPid05Id() {
		return this.pid05Id;
	}

	public void setPid05Id(String pid05Id) {
		this.pid05Id = pid05Id;
	}

	@Column(name = "EPR_STUDY_STATUS", length = 1)
	@Length(max = 1)
	public String getEprStudyStatus() {
		return this.eprStudyStatus;
	}

	public void setEprStudyStatus(String eprStudyStatus) {
		this.eprStudyStatus = eprStudyStatus;
	}

	@Column(name = "EPR_STATUS_HIS", length = 1)
	@Length(max = 1)
	public String getEprStatusHis() {
		return this.eprStatusHis;
	}

	public void setEprStatusHis(String eprStatusHis) {
		this.eprStatusHis = eprStatusHis;
	}

	@Column(name = "OBR_02_EXAM_ID", length = 30)
	@Length(max = 30)
	public String getObr02ExamId() {
		return this.obr02ExamId;
	}

	public void setObr02ExamId(String obr02ExamId) {
		this.obr02ExamId = obr02ExamId;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPid05Id());
		umHashCodeBuilder.append(this.getMshDate());
		umHashCodeBuilder.append(this.getMshId());
		umHashCodeBuilder.append(this.getObrAccNumber());
		umHashCodeBuilder.append(this.getEprStudyStatus());
		umHashCodeBuilder.append(this.getEprStatusHis());
		umHashCodeBuilder.append(this.getObr02ExamId());
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
		if (!(obj instanceof AgfaEprId)) {
			return false;
		}
		AgfaEprId other = (AgfaEprId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPid05Id(), other.getPid05Id());
		umEqualsBuilder.append(this.getMshDate(), other.getMshDate());
		umEqualsBuilder.append(this.getMshId(), other.getMshId());
		umEqualsBuilder.append(this.getObrAccNumber(), other.getObrAccNumber());
		umEqualsBuilder.append(this.getEprStudyStatus(), other.getEprStudyStatus());
		umEqualsBuilder.append(this.getEprStatusHis(), other.getEprStatusHis());
		umEqualsBuilder.append(this.getObr02ExamId(), other.getObr02ExamId());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
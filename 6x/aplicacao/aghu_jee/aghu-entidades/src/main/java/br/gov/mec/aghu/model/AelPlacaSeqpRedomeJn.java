package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelPlacaSeqpRedomeJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_PLACA_SEQP_REDOME_JN", schema = "AGH")
@Immutable
public class AelPlacaSeqpRedomeJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -198714510861489405L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer pc1Seq;
	private Short seqp;
	private String locus;
	private String loteKit;

	public AelPlacaSeqpRedomeJn() {
	}

	public AelPlacaSeqpRedomeJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pc1Seq, Short seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pc1Seq = pc1Seq;
		this.seqp = seqp;
	}

	public AelPlacaSeqpRedomeJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pc1Seq, Short seqp, String locus,
			String loteKit) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pc1Seq = pc1Seq;
		this.seqp = seqp;
		this.locus = locus;
		this.loteKit = loteKit;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "PC1_SEQ", nullable = false)
	public Integer getPc1Seq() {
		return this.pc1Seq;
	}

	public void setPc1Seq(Integer pc1Seq) {
		this.pc1Seq = pc1Seq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "LOCUS", length = 5)
	@Length(max = 5)
	public String getLocus() {
		return this.locus;
	}

	public void setLocus(String locus) {
		this.locus = locus;
	}

	@Column(name = "LOTE_KIT", length = 10)
	@Length(max = 10)
	public String getLoteKit() {
		return this.loteKit;
	}

	public void setLoteKit(String loteKit) {
		this.loteKit = loteKit;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PC1_SEQ("pc1Seq"),
		SEQP("seqp"),
		LOCUS("locus"),
		LOTE_KIT("loteKit");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
package br.gov.mec.aghu.model;

// Generated 06/04/2011 11:15:12 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelExamesEspecialidadeJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelEueJnSeq", sequenceName="AGH.AEL_EUE_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_EXAMES_ESPECIALIDADE_JN", schema = "AGH")
@Immutable
public class AelExamesEspecialidadeJn extends BaseJournal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6790576770960859379L;
	//private Integer seqJn;
	private Short espSeq;
	private String ufeEmaExaSigla;
	private Integer ufeEmaManSeq;
	private Short ufeUnfSeq;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AelExamesEspecialidadeJn() {
	}

	public AelExamesEspecialidadeJn(String jnUser, Date jnDateTime,
			String jnOperation, Short espSeq, String ufeEmaExaSigla,
			Integer ufeEmaManSeq, Short ufeUnfSeq) {
		//this.seqJn = seqJn;
		this.espSeq = espSeq;
		this.ufeEmaExaSigla = ufeEmaExaSigla;
		this.ufeEmaManSeq = ufeEmaManSeq;
		this.ufeUnfSeq = ufeUnfSeq;
	}

	public AelExamesEspecialidadeJn(String jnUser, Date jnDateTime,
			String jnOperation, Short espSeq, String ufeEmaExaSigla,
			Integer ufeEmaManSeq, Short ufeUnfSeq, Date criadoEm,
			Integer serMatricula, Short serVinCodigo) {
		//this.seqJn = seqJn;
		this.espSeq = espSeq;
		this.ufeEmaExaSigla = ufeEmaExaSigla;
		this.ufeEmaManSeq = ufeEmaManSeq;
		this.ufeUnfSeq = ufeUnfSeq;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelEueJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "ESP_SEQ", nullable = false)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "UFE_EMA_EXA_SIGLA", nullable = false, length = 5)
	public String getUfeEmaExaSigla() {
		return this.ufeEmaExaSigla;
	}

	public void setUfeEmaExaSigla(String ufeEmaExaSigla) {
		this.ufeEmaExaSigla = ufeEmaExaSigla;
	}

	@Column(name = "UFE_EMA_MAN_SEQ", nullable = false)
	public Integer getUfeEmaManSeq() {
		return this.ufeEmaManSeq;
	}

	public void setUfeEmaManSeq(Integer ufeEmaManSeq) {
		this.ufeEmaManSeq = ufeEmaManSeq;
	}

	@Column(name = "UFE_UNF_SEQ", nullable = false)
	public Short getUfeUnfSeq() {
		return this.ufeUnfSeq;
	}

	public void setUfeUnfSeq(Short ufeUnfSeq) {
		this.ufeUnfSeq = ufeUnfSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

		SEQ_JN("seqJn"),
		ESP_SEQ("espSeq"),
		UFE_EMA_EXA_SIGLA("ufeEmaExaSigla"),
		UFE_EMA_MAN_SEQ("ufeEmaManSeq"),
		UFE_UNF_SEQ("ufeUnfSeq"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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
package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MciItemCondicaoClinica generated by hbm2java
 */
@Entity
@Table(name = "MCI_ITEM_CONDICAO_CLINICAS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "ccl_seq",
		"fpd_seq", "cif_seq", "por_seq", "top_seq" }))
public class MciItemCondicaoClinica extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 187068960904723498L;
	private Short seq;
	private Integer version;
	private MciFatorPredisponentes mciFatorPredisponentes;
	private MciCidNotificacao mciCidNotificacao;
	private RapServidores rapServidores;
	private MciCondicaoClinica mciCondicaoClinica;
	private MciTopografiaProcedimento mciTopografiaProcedimento;
	private MciProcedimentoRisco mciProcedimentoRisco;
	private String indSituacao;
	private Date criadoEm;

	public MciItemCondicaoClinica() {
	}

	public MciItemCondicaoClinica(Short seq, RapServidores rapServidores, MciCondicaoClinica mciCondicaoClinica,
			String indSituacao, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mciCondicaoClinica = mciCondicaoClinica;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public MciItemCondicaoClinica(Short seq, MciFatorPredisponentes mciFatorPredisponentes, MciCidNotificacao mciCidNotificacao,
			RapServidores rapServidores, MciCondicaoClinica mciCondicaoClinica,
			MciTopografiaProcedimento mciTopografiaProcedimento, MciProcedimentoRisco mciProcedimentoRisco, String indSituacao,
			Date criadoEm) {
		this.seq = seq;
		this.mciFatorPredisponentes = mciFatorPredisponentes;
		this.mciCidNotificacao = mciCidNotificacao;
		this.rapServidores = rapServidores;
		this.mciCondicaoClinica = mciCondicaoClinica;
		this.mciTopografiaProcedimento = mciTopografiaProcedimento;
		this.mciProcedimentoRisco = mciProcedimentoRisco;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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
	@JoinColumn(name = "FPD_SEQ")
	public MciFatorPredisponentes getMciFatorPredisponentes() {
		return this.mciFatorPredisponentes;
	}

	public void setMciFatorPredisponentes(MciFatorPredisponentes mciFatorPredisponentes) {
		this.mciFatorPredisponentes = mciFatorPredisponentes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CIF_SEQ")
	public MciCidNotificacao getMciCidNotificacao() {
		return this.mciCidNotificacao;
	}

	public void setMciCidNotificacao(MciCidNotificacao mciCidNotificacao) {
		this.mciCidNotificacao = mciCidNotificacao;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCL_SEQ", nullable = false)
	public MciCondicaoClinica getMciCondicaoClinica() {
		return this.mciCondicaoClinica;
	}

	public void setMciCondicaoClinica(MciCondicaoClinica mciCondicaoClinica) {
		this.mciCondicaoClinica = mciCondicaoClinica;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TOP_SEQ")
	public MciTopografiaProcedimento getMciTopografiaProcedimento() {
		return this.mciTopografiaProcedimento;
	}

	public void setMciTopografiaProcedimento(MciTopografiaProcedimento mciTopografiaProcedimento) {
		this.mciTopografiaProcedimento = mciTopografiaProcedimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POR_SEQ")
	public MciProcedimentoRisco getMciProcedimentoRisco() {
		return this.mciProcedimentoRisco;
	}

	public void setMciProcedimentoRisco(MciProcedimentoRisco mciProcedimentoRisco) {
		this.mciProcedimentoRisco = mciProcedimentoRisco;
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

		SEQ("seq"),
		VERSION("version"),
		MCI_FATOR_PREDISPONENTES("mciFatorPredisponentes"),
		MCI_CID_NOTIFICACAO("mciCidNotificacao"),
		RAP_SERVIDORES("rapServidores"),
		MCI_CONDICAO_CLINICAS("mciCondicaoClinica"),
		MCI_TOPOGRAFIA_PROCEDIMENTO("mciTopografiaProcedimento"),
		MCI_TOPOGRAFIA_PROCEDIMENTO_SEQ("mciTopografiaProcedimento.seq"),
		MCI_PROCEDIMENTO_RISCOS("mciProcedimentoRisco"),
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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MciItemCondicaoClinica)) {
			return false;
		}
		MciItemCondicaoClinica other = (MciItemCondicaoClinica) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
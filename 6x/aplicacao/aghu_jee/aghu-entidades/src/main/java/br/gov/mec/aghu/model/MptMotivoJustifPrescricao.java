package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptMotivoJustifPrescricao generated by hbm2java
 */
@Entity
@Table(name = "MPT_MOTIVO_JUSTIF_PRESCRICOES", schema = "AGH")
public class MptMotivoJustifPrescricao extends BaseEntityId<MptMotivoJustifPrescricaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5197255061661212166L;
	private MptMotivoJustifPrescricaoId id;
	private Integer version;
	private AfaMedicamento afaMedicamento;
	private MptJustifPrescricao mptJustifPrescricao;
	private String operacao;
	private String origem;
	private Set<MptItemJustifPrescricao> mptItemJustifPrescricaoes = new HashSet<MptItemJustifPrescricao>(0);

	public MptMotivoJustifPrescricao() {
	}

	public MptMotivoJustifPrescricao(MptMotivoJustifPrescricaoId id, MptJustifPrescricao mptJustifPrescricao, String operacao,
			String origem) {
		this.id = id;
		this.mptJustifPrescricao = mptJustifPrescricao;
		this.operacao = operacao;
		this.origem = origem;
	}

	public MptMotivoJustifPrescricao(MptMotivoJustifPrescricaoId id, AfaMedicamento afaMedicamento,
			MptJustifPrescricao mptJustifPrescricao, String operacao, String origem,
			Set<MptItemJustifPrescricao> mptItemJustifPrescricaoes) {
		this.id = id;
		this.afaMedicamento = afaMedicamento;
		this.mptJustifPrescricao = mptJustifPrescricao;
		this.operacao = operacao;
		this.origem = origem;
		this.mptItemJustifPrescricaoes = mptItemJustifPrescricaoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "jupAtdSeq", column = @Column(name = "JUP_ATD_SEQ", nullable = false)),
			@AttributeOverride(name = "jupSeq", column = @Column(name = "JUP_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MptMotivoJustifPrescricaoId getId() {
		return this.id;
	}

	public void setId(MptMotivoJustifPrescricaoId id) {
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
	@JoinColumn(name = "MED_MAT_CODIGO")
	public AfaMedicamento getAfaMedicamento() {
		return this.afaMedicamento;
	}

	public void setAfaMedicamento(AfaMedicamento afaMedicamento) {
		this.afaMedicamento = afaMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "JUP_ATD_SEQ", referencedColumnName = "ATD_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "JUP_SEQ", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false) })
	public MptJustifPrescricao getMptJustifPrescricao() {
		return this.mptJustifPrescricao;
	}

	public void setMptJustifPrescricao(MptJustifPrescricao mptJustifPrescricao) {
		this.mptJustifPrescricao = mptJustifPrescricao;
	}

	@Column(name = "OPERACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getOperacao() {
		return this.operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	@Column(name = "ORIGEM", nullable = false, length = 1)
	@Length(max = 1)
	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptMotivoJustifPrescricao")
	public Set<MptItemJustifPrescricao> getMptItemJustifPrescricaoes() {
		return this.mptItemJustifPrescricaoes;
	}

	public void setMptItemJustifPrescricaoes(Set<MptItemJustifPrescricao> mptItemJustifPrescricaoes) {
		this.mptItemJustifPrescricaoes = mptItemJustifPrescricaoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		AFA_MEDICAMENTO("afaMedicamento"),
		MPT_JUSTIF_PRESCRICOES("mptJustifPrescricao"),
		OPERACAO("operacao"),
		ORIGEM("origem"),
		MPT_ITEM_JUSTIF_PRESCRICAOES("mptItemJustifPrescricaoes");

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
		if (!(obj instanceof MptMotivoJustifPrescricao)) {
			return false;
		}
		MptMotivoJustifPrescricao other = (MptMotivoJustifPrescricao) obj;
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
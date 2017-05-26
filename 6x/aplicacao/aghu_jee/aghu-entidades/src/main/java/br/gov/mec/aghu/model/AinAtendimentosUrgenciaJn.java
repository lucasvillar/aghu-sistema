package br.gov.mec.aghu.model;

// Generated 17/06/2010 15:54:18 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioLocalPaciente;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AinAtendimentosUrgenciaJn generated by hbm2java
 */
@Entity
@Table(name = "AIN_ATENDIMENTOS_URGENCIA_JN", schema = "AGH")
@SequenceGenerator(name = "ainAtuJnSeq", sequenceName = "AGH.AIN_ATU_JN_SEQ", allocationSize = 1)

@Immutable
public class AinAtendimentosUrgenciaJn extends BaseJournal implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3599957555340738274L;
	private Integer seq;
	private Integer cidSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Short cspCnvCodigo;
	private Byte cspSeq;
	private Date dtAtendimento;
	private Integer pacCodigo;
	private Boolean indInternacao;
	private Boolean indPacienteEmAtendimento;
	private DominioLocalPaciente indLocalPaciente;
	private Integer conNumero;
	private Short espSeq;
	private String ltoLtoId;
	private Short qrtNumero;
	private Short unfSeq;
	private Byte clcCodigo;
	private String tamCodigo;
	private Date dtAltaAtendimento;
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ainAtuJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "CID_SEQ", precision = 5, scale = 0)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}

	@Column(name = "SER_MATRICULA", precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "CSP_CNV_CODIGO", precision = 3, scale = 0)
	public Short getCspCnvCodigo() {
		return this.cspCnvCodigo;
	}

	public void setCspCnvCodigo(Short cspCnvCodigo) {
		this.cspCnvCodigo = cspCnvCodigo;
	}

	@Column(name = "CSP_SEQ", precision = 2, scale = 0)
	public Byte getCspSeq() {
		return this.cspSeq;
	}

	public void setCspSeq(Byte cspSeq) {
		this.cspSeq = cspSeq;
	}

	@Column(name = "DT_ATENDIMENTO", length = 7)
	public Date getDtAtendimento() {
		return this.dtAtendimento;
	}

	public void setDtAtendimento(Date dtAtendimento) {
		this.dtAtendimento = dtAtendimento;
	}

	@Column(name = "PAC_CODIGO", precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "IND_INTERNACAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndInternacao() {
		return this.indInternacao;
	}

	public void setIndInternacao(Boolean indInternacao) {
		this.indInternacao = indInternacao;
	}

	@Column(name = "IND_PACIENTE_EM_ATENDIMENTO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndPacienteEmAtendimento() {
		return this.indPacienteEmAtendimento;
	}

	public void setIndPacienteEmAtendimento(Boolean indPacienteEmAtendimento) {
		this.indPacienteEmAtendimento = indPacienteEmAtendimento;
	}

	@Column(name = "IND_LOCAL_PACIENTE", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioLocalPaciente getIndLocalPaciente() {
		return this.indLocalPaciente;
	}

	public void setIndLocalPaciente(DominioLocalPaciente indLocalPaciente) {
		this.indLocalPaciente = indLocalPaciente;
	}

	@Column(name = "CON_NUMERO", precision = 8, scale = 0)
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "ESP_SEQ", precision = 4, scale = 0)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "LTO_LTO_ID", length = 14)
	@Length(max = 14)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "QRT_NUMERO", precision = 4, scale = 0)
	public Short getQrtNumero() {
		return this.qrtNumero;
	}

	public void setQrtNumero(Short qrtNumero) {
		this.qrtNumero = qrtNumero;
	}

	@Column(name = "UNF_SEQ", precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "CLC_CODIGO", precision = 2, scale = 0)
	public Byte getClcCodigo() {
		return this.clcCodigo;
	}

	public void setClcCodigo(Byte clcCodigo) {
		this.clcCodigo = clcCodigo;
	}

	@Column(name = "TAM_CODIGO", length = 3)
	@Length(max = 3)
	public String getTamCodigo() {
		return this.tamCodigo;
	}

	public void setTamCodigo(String tamCodigo) {
		this.tamCodigo = tamCodigo;
	}

	@Column(name = "DT_ALTA_ATENDIMENTO", length = 7)
	public Date getDtAltaAtendimento() {
		return this.dtAltaAtendimento;
	}

	public void setDtAltaAtendimento(Date dtAltaAtendimento) {
		this.dtAltaAtendimento = dtAltaAtendimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getSeqJn() == null) ? 0 : getSeqJn().hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AinAtendimentosUrgenciaJn other = (AinAtendimentosUrgenciaJn) obj;
		if (getSeqJn() == null) {
			if (other.getSeqJn() != null) {
				return false;
			}
		} else if (!getSeqJn().equals(other.getSeqJn())) {
			return false;
		}
		return true;
	}

	public enum Fields {

		SEQ("seq"),
		CID_SEQ("cidSeq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CSP_CNV_CODIGO("cspCnvCodigo"),
		CSP_SEQ("cspSeq"),
		DT_ATENDIMENTO("dtAtendimento"),
		PAC_CODIGO("pacCodigo"),
		IND_INTERNACAO("indInternacao"),
		IND_PACIENTE_EM_ATENDIMENTO("indPacienteEmAtendimento"),
		IND_LOCAL_PACIENTE("indLocalPaciente"),
		CON_NUMERO("conNumero"),
		ESP_SEQ("espSeq"),
		LTO_LTO_ID("ltoLtoId"),
		QRT_NUMERO("qrtNumero"),
		UNF_SEQ("unfSeq"),
		CLC_CODIGO("clcCodigo"),
		TAM_CODIGO("tamCodigo"),
		DT_ALTA_ATENDIMENTO("dtAltaAtendimento");

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
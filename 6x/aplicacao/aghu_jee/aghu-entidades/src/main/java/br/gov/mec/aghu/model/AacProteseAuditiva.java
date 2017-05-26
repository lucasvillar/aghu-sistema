package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AacProteseAuditiva generated by hbm2java
 */
@Entity
@Table(name = "AAC_PROTESES_AUDITIVAS", schema = "AGH")
public class AacProteseAuditiva extends BaseEntityId<AacProteseAuditivaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7676170386487030261L;
	private AacProteseAuditivaId id;
	private Integer seq;
	private String situacao;

	public AacProteseAuditiva() {
		
	}

	public AacProteseAuditiva(AacProteseAuditivaId id) {
		this.id = id;
	}

	
	
	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", nullable = false, length = 29)),
			@AttributeOverride(name = "situacao", column = @Column(name = "SITUACAO", length = 1)),
			@AttributeOverride(name = "motivoRejeicao", column = @Column(name = "MOTIVO_REJEICAO", length = 240)),
			@AttributeOverride(name = "lote", column = @Column(name = "LOTE", length = 20)),
			@AttributeOverride(name = "nroSerie", column = @Column(name = "NRO_SERIE", length = 20)),
			@AttributeOverride(name = "justificativa", column = @Column(name = "JUSTIFICATIVA", length = 240)),
			@AttributeOverride(name = "opcao", column = @Column(name = "OPCAO", nullable = false)),
			@AttributeOverride(name = "ouvido", column = @Column(name = "OUVIDO", length = 1)),
			@AttributeOverride(name = "dthrAdaptacao", column = @Column(name = "DTHR_ADAPTACAO", length = 29)),
			@AttributeOverride(name = "reposicao", column = @Column(name = "REPOSICAO", length = 1)),
			@AttributeOverride(name = "alteradoEm", column = @Column(name = "ALTERADO_EM", length = 29)),
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false)),
			@AttributeOverride(name = "phiSeq", column = @Column(name = "PHI_SEQ", nullable = false)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "serMatriculaAlteradoPor", column = @Column(name = "SER_MATRICULA_ALTERADO_POR")),
			@AttributeOverride(name = "serVinCodigoAlteradoPor", column = @Column(name = "SER_VIN_CODIGO_ALTERADO_POR")),
			@AttributeOverride(name = "matCodigo", column = @Column(name = "MAT_CODIGO", nullable = false)),
			@AttributeOverride(name = "afnNumero", column = @Column(name = "AFN_NUMERO", nullable = false)),
			@AttributeOverride(name = "cidSeq", column = @Column(name = "CID_SEQ")),
			@AttributeOverride(name = "momMcmCodigo", column = @Column(name = "MOM_MCM_CODIGO", nullable = false)),
			@AttributeOverride(name = "momSeqp", column = @Column(name = "MOM_SEQP")),
			@AttributeOverride(name = "atdSeqAdaptado", column = @Column(name = "ATD_SEQ_ADAPTADO")),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AacProteseAuditivaId getId() {
		return this.id;
	}

	public void setId(AacProteseAuditivaId id) {
		this.id = id;
	}

	
	
	public enum Fields {

		ID("id"),
		ATD_SEQ("id.atdSeq"),
		SITUACAO("situacao"),
		SEQ("seq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	@Column(name = "SEQ", insertable=false, updatable=false)
	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "SITUACAO", length = 1, insertable=false, updatable=false)
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
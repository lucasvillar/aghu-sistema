package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpaUsoOrdItemExame generated by hbm2java
 */
@Entity
@Table(name = "MPA_USO_ORD_ITEM_EXAMES", schema = "AGH")
public class MpaUsoOrdItemExame extends BaseEntityId<MpaUsoOrdItemExameId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1181986143834083591L;
	private MpaUsoOrdItemExameId id;
	private Integer version;
	private MpaUsoOrdExame mpaUsoOrdExame;
	private RapServidores rapServidores;
	private AelUnfExecutaExames aelUnfExecutaExames;
	private MpaCadOrdItemExame mpaCadOrdItemExame;
	private AelRegiaoAnatomica aelRegiaoAnatomica;
	private AelSitItemSolicitacoes aelSitItemSolicitacoes;
	private AelIntervaloColeta aelIntervaloColeta;
	private Date criadoEm;
	private String tipoColeta;
	private String indUsoO2;
	private String tipoTransporte;
	private String descRegiaoAnatomica;
	private String descMaterialAnalise;
	private Short nroAmostras;
	private Short intervaloDias;
	private Date intervaloHoras;
	private Date dthrProgramada;

	public MpaUsoOrdItemExame() {
	}

	public MpaUsoOrdItemExame(MpaUsoOrdItemExameId id, MpaUsoOrdExame mpaUsoOrdExame, RapServidores rapServidores,
			AelUnfExecutaExames aelUnfExecutaExames, Date criadoEm, String indUsoO2) {
		this.id = id;
		this.mpaUsoOrdExame = mpaUsoOrdExame;
		this.rapServidores = rapServidores;
		this.aelUnfExecutaExames = aelUnfExecutaExames;
		this.criadoEm = criadoEm;
		this.indUsoO2 = indUsoO2;
	}

	public MpaUsoOrdItemExame(MpaUsoOrdItemExameId id, MpaUsoOrdExame mpaUsoOrdExame, RapServidores rapServidores,
			AelUnfExecutaExames aelUnfExecutaExames, MpaCadOrdItemExame mpaCadOrdItemExame,
			AelRegiaoAnatomica aelRegiaoAnatomica, AelSitItemSolicitacoes aelSitItemSolicitacoes,
			AelIntervaloColeta aelIntervaloColeta, Date criadoEm, String tipoColeta, String indUsoO2, String tipoTransporte,
			String descRegiaoAnatomica, String descMaterialAnalise, Short nroAmostras, Short intervaloDias, Date intervaloHoras,
			Date dthrProgramada) {
		this.id = id;
		this.mpaUsoOrdExame = mpaUsoOrdExame;
		this.rapServidores = rapServidores;
		this.aelUnfExecutaExames = aelUnfExecutaExames;
		this.mpaCadOrdItemExame = mpaCadOrdItemExame;
		this.aelRegiaoAnatomica = aelRegiaoAnatomica;
		this.aelSitItemSolicitacoes = aelSitItemSolicitacoes;
		this.aelIntervaloColeta = aelIntervaloColeta;
		this.criadoEm = criadoEm;
		this.tipoColeta = tipoColeta;
		this.indUsoO2 = indUsoO2;
		this.tipoTransporte = tipoTransporte;
		this.descRegiaoAnatomica = descRegiaoAnatomica;
		this.descMaterialAnalise = descMaterialAnalise;
		this.nroAmostras = nroAmostras;
		this.intervaloDias = intervaloDias;
		this.intervaloHoras = intervaloHoras;
		this.dthrProgramada = dthrProgramada;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "uoeSeq", column = @Column(name = "UOE_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MpaUsoOrdItemExameId getId() {
		return this.id;
	}

	public void setId(MpaUsoOrdItemExameId id) {
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
	@JoinColumn(name = "UOE_SEQ", nullable = false, insertable = false, updatable = false)
	public MpaUsoOrdExame getMpaUsoOrdExame() {
		return this.mpaUsoOrdExame;
	}

	public void setMpaUsoOrdExame(MpaUsoOrdExame mpaUsoOrdExame) {
		this.mpaUsoOrdExame = mpaUsoOrdExame;
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
	@JoinColumns({ @JoinColumn(name = "UFE_EMA_EXA_SIGLA", referencedColumnName = "EMA_EXA_SIGLA", nullable = false),
			@JoinColumn(name = "UFE_EMA_MAN_SEQ", referencedColumnName = "EMA_MAN_SEQ", nullable = false),
			@JoinColumn(name = "UFE_UNF_SEQ", referencedColumnName = "UNF_SEQ", nullable = false) })
	public AelUnfExecutaExames getAelUnfExecutaExames() {
		return this.aelUnfExecutaExames;
	}

	public void setAelUnfExecutaExames(AelUnfExecutaExames aelUnfExecutaExames) {
		this.aelUnfExecutaExames = aelUnfExecutaExames;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CIX_COX_SEQ", referencedColumnName = "COX_SEQ"),
			@JoinColumn(name = "CIX_SEQP", referencedColumnName = "SEQP") })
	public MpaCadOrdItemExame getMpaCadOrdItemExame() {
		return this.mpaCadOrdItemExame;
	}

	public void setMpaCadOrdItemExame(MpaCadOrdItemExame mpaCadOrdItemExame) {
		this.mpaCadOrdItemExame = mpaCadOrdItemExame;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RAN_SEQ")
	public AelRegiaoAnatomica getAelRegiaoAnatomica() {
		return this.aelRegiaoAnatomica;
	}

	public void setAelRegiaoAnatomica(AelRegiaoAnatomica aelRegiaoAnatomica) {
		this.aelRegiaoAnatomica = aelRegiaoAnatomica;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIT_CODIGO")
	public AelSitItemSolicitacoes getAelSitItemSolicitacoes() {
		return this.aelSitItemSolicitacoes;
	}

	public void setAelSitItemSolicitacoes(AelSitItemSolicitacoes aelSitItemSolicitacoes) {
		this.aelSitItemSolicitacoes = aelSitItemSolicitacoes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ICO_SEQ")
	public AelIntervaloColeta getAelIntervaloColeta() {
		return this.aelIntervaloColeta;
	}

	public void setAelIntervaloColeta(AelIntervaloColeta aelIntervaloColeta) {
		this.aelIntervaloColeta = aelIntervaloColeta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "TIPO_COLETA", length = 1)
	@Length(max = 1)
	public String getTipoColeta() {
		return this.tipoColeta;
	}

	public void setTipoColeta(String tipoColeta) {
		this.tipoColeta = tipoColeta;
	}

	@Column(name = "IND_USO_O2", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUsoO2() {
		return this.indUsoO2;
	}

	public void setIndUsoO2(String indUsoO2) {
		this.indUsoO2 = indUsoO2;
	}

	@Column(name = "TIPO_TRANSPORTE", length = 1)
	@Length(max = 1)
	public String getTipoTransporte() {
		return this.tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	@Column(name = "DESC_REGIAO_ANATOMICA", length = 100)
	@Length(max = 100)
	public String getDescRegiaoAnatomica() {
		return this.descRegiaoAnatomica;
	}

	public void setDescRegiaoAnatomica(String descRegiaoAnatomica) {
		this.descRegiaoAnatomica = descRegiaoAnatomica;
	}

	@Column(name = "DESC_MATERIAL_ANALISE", length = 100)
	@Length(max = 100)
	public String getDescMaterialAnalise() {
		return this.descMaterialAnalise;
	}

	public void setDescMaterialAnalise(String descMaterialAnalise) {
		this.descMaterialAnalise = descMaterialAnalise;
	}

	@Column(name = "NRO_AMOSTRAS")
	public Short getNroAmostras() {
		return this.nroAmostras;
	}

	public void setNroAmostras(Short nroAmostras) {
		this.nroAmostras = nroAmostras;
	}

	@Column(name = "INTERVALO_DIAS")
	public Short getIntervaloDias() {
		return this.intervaloDias;
	}

	public void setIntervaloDias(Short intervaloDias) {
		this.intervaloDias = intervaloDias;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INTERVALO_HORAS", length = 29)
	public Date getIntervaloHoras() {
		return this.intervaloHoras;
	}

	public void setIntervaloHoras(Date intervaloHoras) {
		this.intervaloHoras = intervaloHoras;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_PROGRAMADA", length = 29)
	public Date getDthrProgramada() {
		return this.dthrProgramada;
	}

	public void setDthrProgramada(Date dthrProgramada) {
		this.dthrProgramada = dthrProgramada;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MPA_USO_ORD_EXAMES("mpaUsoOrdExame"),
		RAP_SERVIDORES("rapServidores"),
		AEL_UNF_EXECUTA_EXAMES("aelUnfExecutaExames"),
		MPA_CAD_ORD_ITEM_EXAME("mpaCadOrdItemExame"),
		AEL_REGIAO_ANATOMICA("aelRegiaoAnatomica"),
		AEL_SIT_ITEM_SOLICITACOES("aelSitItemSolicitacoes"),
		AEL_INTERVALO_COLETA("aelIntervaloColeta"),
		CRIADO_EM("criadoEm"),
		TIPO_COLETA("tipoColeta"),
		IND_USO_O2("indUsoO2"),
		TIPO_TRANSPORTE("tipoTransporte"),
		DESC_REGIAO_ANATOMICA("descRegiaoAnatomica"),
		DESC_MATERIAL_ANALISE("descMaterialAnalise"),
		NRO_AMOSTRAS("nroAmostras"),
		INTERVALO_DIAS("intervaloDias"),
		INTERVALO_HORAS("intervaloHoras"),
		DTHR_PROGRAMADA("dthrProgramada");

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
		if (!(obj instanceof MpaUsoOrdItemExame)) {
			return false;
		}
		MpaUsoOrdItemExame other = (MpaUsoOrdItemExame) obj;
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
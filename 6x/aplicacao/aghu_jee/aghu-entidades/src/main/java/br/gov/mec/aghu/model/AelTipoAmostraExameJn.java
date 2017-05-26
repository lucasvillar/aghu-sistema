package br.gov.mec.aghu.model;

// Generated 30/03/2011 16:37:09 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.dominio.DominioOrigemAtendimento;
import br.gov.mec.aghu.dominio.DominioResponsavelColetaExames;
import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioUnidadeMedidaAmostra;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelTiposAmostraExamesJn generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})

@Entity
@SequenceGenerator(name = "aelTaejJnSq1", sequenceName = "AGH.AEL_TAE_jn_seq", allocationSize = 1)
@Table(name = "AEL_TIPOS_AMOSTRA_EXAMES_JN", schema = "AGH")
@Immutable
public class AelTipoAmostraExameJn extends BaseJournal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 272165833244258297L;
	private AelExamesMaterialAnalise examesMaterialAnalise;
	private AelMateriaisAnalises materialAnalise;
	private DominioOrigemAtendimento origemAtendimento;
	private AelRecipienteColeta recipienteColeta;
	private DominioUnidadeMedidaAmostra unidadeMedidaAmostra;
	private DominioResponsavelColetaExames responsavelColeta;
	private DominioSimNao indCongela;
	private AelAnticoagulante anticoagulante;
	private AghUnidadesFuncionais unidadeFuncional;
	private Short nroAmostras;
	private RapServidores servidorAlterado;
	private Integer volumeAmostra;

	public AelTipoAmostraExameJn() {
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelTaejJnSq1")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EMA_EXA_SIGLA", referencedColumnName = "EXA_SIGLA", nullable = false),
			@JoinColumn(name = "EMA_MAN_SEQ", referencedColumnName = "MAN_SEQ", nullable = false) })
	public AelExamesMaterialAnalise getExamesMaterialAnalise() {
		return examesMaterialAnalise;
	}

	public void setExamesMaterialAnalise(AelExamesMaterialAnalise examesMaterialAnalise) {
		this.examesMaterialAnalise = examesMaterialAnalise;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAN_SEQ", nullable = false)
	public AelMateriaisAnalises getMaterialAnalise() {
		return materialAnalise;
	}
	
	public void setMaterialAnalise(AelMateriaisAnalises materialAnalise) {
		this.materialAnalise = materialAnalise;
	}

	@Column(name = "ORIGEM_ATENDIMENTO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemAtendimento getOrigemAtendimento() {
		return origemAtendimento;
	}
	
	public void setOrigemAtendimento(DominioOrigemAtendimento origemAtendimento) {
		this.origemAtendimento = origemAtendimento;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RCO_SEQ")
	public AelRecipienteColeta getRecipienteColeta() {
		return recipienteColeta;
	}
	
	public void setRecipienteColeta(AelRecipienteColeta recipienteColeta) {
		this.recipienteColeta = recipienteColeta;
	}
	

	@Column(name = "UNID_MEDIDA_AMOSTRA",  length = 3)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeMedidaAmostra getUnidadeMedidaAmostra() {
		return unidadeMedidaAmostra;
	}
	
	public void setUnidadeMedidaAmostra(DominioUnidadeMedidaAmostra unidadeMedidaAmostra) {
		this.unidadeMedidaAmostra = unidadeMedidaAmostra;
	}
	
	@Column(name = "RESPONSAVEL_COLETA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioResponsavelColetaExames getResponsavelColeta() {
		return responsavelColeta;
	}
	
	public void setResponsavelColeta(
			DominioResponsavelColetaExames responsavelColeta) {
		this.responsavelColeta = responsavelColeta;
	}
	
	@Column(name = "IND_CONGELA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCongela() {
		return indCongela;
	}
	
	public void setIndCongela(DominioSimNao indCongela) {
		this.indCongela = indCongela;
	}	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATC_SEQ", nullable = true)
	public AelAnticoagulante getAnticoagulante() {
		return anticoagulante;
	}
	
	public void setAnticoagulante(AelAnticoagulante anticoagulante) {
		this.anticoagulante = anticoagulante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = true)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
	@Column(name = "NRO_AMOSTRAS")
	public Short getNroAmostras() {
		return this.nroAmostras;
	}

	public void setNroAmostras(Short nroAmostras) {
		this.nroAmostras = nroAmostras;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}

	@Column(name = "VOLUME_AMOSTRA")
	public Integer getVolumeAmostra() {
		return this.volumeAmostra;
	}

	public void setVolumeAmostra(Integer volumeAmostra) {
		this.volumeAmostra = volumeAmostra;
	}

	public enum Fields {

		EXAMES_MATERIAL_ANALISE("examesMaterialAnalise"),
		MATERIAL_ANALISE("materialAnalise"),
		ORIGEM_ATENDIMENTO("origemAtendimento"),
		RECIPIENTE_COLETA("recipienteColeta"),
		UNIDADE_MEDIDA_AMOSTRA("unidadeMedidaAmostra"),
		RESPONSAVEL_COLETA("responsavelColeta"),
		IND_CONGELA("indCongela"),
		ANTICOAGULANTE("anticoagulante"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		NRO_AMOSTRAS("nroAmostras"),
		SERVIDOR_ALTERADO("servidorAlterado"),
		VOLUME_AMOSTRA("volumeAmostra");

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
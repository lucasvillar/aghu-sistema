package br.gov.mec.aghu.model;

// Generated 22/11/2010 17:11:45 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;



import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoCampoCampoLaudo;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelCampoLaudo generated by hbm2java
 */
@Entity
@SuppressWarnings({"PMD.CyclomaticComplexity"})
@Table(name = "AEL_CAMPOS_LAUDO", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "NOME"))
public class AelCampoLaudo extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3351465961272565547L;
	private Integer seq;
	private Integer version;
	private String nome;
	private DominioTipoCampoCampoLaudo tipoCampo;
	private Boolean fluxo;
	private DominioSituacao situacao;	
	private AelGrupoResultadoCaracteristica grupoResultadoCaracteristica;	
	private AelGrupoResultadoCodificado grupoResultadoCodificado;	
	private RapServidores servidor;
	private Date criadoEm;
	private Short ordem;
	private Boolean cancelaItemDept;
	private Boolean pertenceApac;
	private String nomeSumario;
	private Boolean dividePorMil;
	private Boolean permiteDigitacao;
	private Boolean pertenceContador; 
	private Boolean pertenceAbs;

	private Set<AbsExameComponenteVisualPrescricao> examesCompVisualPrescricao = new HashSet<AbsExameComponenteVisualPrescricao>(0);
	
	private Set<AelValorNormalidCampo> valoresNormalidade = new HashSet<AelValorNormalidCampo>();
	private Set<AelEspecialidadeCampoLaudo> especialidadeCampoLaudo = new HashSet<AelEspecialidadeCampoLaudo>();
	private Set<AelServidorCampoLaudo> servidorCampoLaudo = new HashSet<AelServidorCampoLaudo>();
	private Set<AelCampoUsoFaturamento> campoUsoFaturamento = new HashSet<AelCampoUsoFaturamento>();
	
	private Set<AelParametroCamposLaudo> parametrosCamposLaudo = new HashSet<AelParametroCamposLaudo>();
	

	private enum AelCampoLaudoModelExceptionCode implements BusinessExceptionCode{
		AEL_CAL_CK12, AEL_CAL_CK4, AEL_CAL_CK5, AEL_CAL_CK6, AEL_CAL_CK8
	}
	
	private List<MtxExameUltResults> mtxExameUltResults;
	
	public AelCampoLaudo() {
	}

	public AelCampoLaudo(Integer seq, String nome, DominioTipoCampoCampoLaudo tipoCampo,
			Boolean fluxo, DominioSituacao situacao, RapServidores servidor,
			Date criadoEm, Boolean cancelaItemDept,
			Boolean pertenceApac, Boolean dividePorMil,
			Boolean permiteDigitacao, Boolean pertenceContador,
			Boolean pertenceAbs) {
		this.seq = seq;
		this.nome = nome;
		this.tipoCampo = tipoCampo;
		this.fluxo = fluxo;
		this.situacao = situacao;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.cancelaItemDept = cancelaItemDept;
		this.pertenceApac = pertenceApac;
		this.dividePorMil = dividePorMil;
		this.permiteDigitacao = permiteDigitacao;
		this.pertenceContador = pertenceContador;
		this.pertenceAbs = pertenceAbs;
	}

	public AelCampoLaudo(Integer seq, String nome, DominioTipoCampoCampoLaudo tipoCampo,
			Boolean fluxo, DominioSituacao situacao, AelGrupoResultadoCaracteristica grupoResultadoCaracteristica,
			AelGrupoResultadoCodificado grupoResultadoCodificado, RapServidores servidor,
			Date criadoEm, Short ordem, Boolean cancelaItemDept,
			String nomeSumario, Boolean pertenceApac, Boolean dividePorMil,
			Boolean permiteDigitacao, Boolean pertenceContador,
			Boolean pertenceAbs
			,Set<AbsExameComponenteVisualPrescricao> examesCompVisualPrescricao
			) {
		this.seq = seq;
		this.nome = nome;
		this.tipoCampo = tipoCampo;
		this.fluxo = fluxo;
		this.situacao = situacao;
		this.grupoResultadoCaracteristica = grupoResultadoCaracteristica;
		this.grupoResultadoCodificado = grupoResultadoCodificado;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.ordem = ordem;
		this.cancelaItemDept = cancelaItemDept;
		this.nomeSumario = nomeSumario;
		this.pertenceApac = pertenceApac;
		this.dividePorMil = dividePorMil;
		this.permiteDigitacao = permiteDigitacao;
		this.pertenceContador = pertenceContador;
		this.pertenceAbs = pertenceAbs;
		this.examesCompVisualPrescricao = examesCompVisualPrescricao;
	}

	@Id
	@SequenceGenerator(name="ael_campos_laudo_seq_generator", sequenceName="AGH.AEL_CAL_SQ1", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="ael_campos_laudo_seq_generator")
	@Column(name = "SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = true)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "NOME", unique = true, nullable = false, length = 100)
	@Length(max = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "TIPO_CAMPO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoCampoCampoLaudo getTipoCampo() {
		return this.tipoCampo;
	}

	public void setTipoCampo(DominioTipoCampoCampoLaudo tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	@Column(name = "IND_FLUXO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getFluxo() {
		return fluxo;
	}

	public void setFluxo(Boolean fluxo) {
		this.fluxo = fluxo;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}
	/**
	 * responsável.
	 * 
	 * @return
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ORDEM", precision = 4, scale = 0)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Column(name = "IND_CANCELA_ITEM_DEPT", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getCancelaItemDept() {
		return cancelaItemDept;
	}

	public void setCancelaItemDept(Boolean cancelaItemDept) {
		this.cancelaItemDept = cancelaItemDept;
	}

	@Column(name = "NOME_SUMARIO", length = 30)
	@Length(max = 30)
	public String getNomeSumario() {
		return this.nomeSumario;
	}

	public void setNomeSumario(String nomeSumario) {
		this.nomeSumario = nomeSumario;
	}

	@Column(name = "IND_PERTENCE_APAC", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPertenceApac() {
		return pertenceApac;
	}

	public void setPertenceApac(Boolean pertenceApac) {
		this.pertenceApac = pertenceApac;
	}


	@Column(name = "IND_DIVIDE_POR_MIL", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getDividePorMil() {
		return dividePorMil;
	}

	public void setDividePorMil(Boolean dividePorMil) {
		this.dividePorMil = dividePorMil;
	}

	@Column(name = "IND_PERMITE_DIGITACAO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPermiteDigitacao() {
		return permiteDigitacao;
	}

	public void setPermiteDigitacao(Boolean permiteDigitacao) {
		this.permiteDigitacao = permiteDigitacao;
	}


	@Column(name = "IND_PERTENCE_CONTADOR", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPertenceContador() {
		return pertenceContador;
	}

	public void setPertenceContador(Boolean pertenceContador) {
		this.pertenceContador = pertenceContador;
	}


	@Column(name = "IND_PERTENCE_ABS", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPertenceAbs() {
		return pertenceAbs;
	}

	public void setPertenceAbs(Boolean pertenceAbs) {
		this.pertenceAbs = pertenceAbs;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public Set<AbsExameComponenteVisualPrescricao> getExamesCompVisualPrescricao() {
		return examesCompVisualPrescricao;
	}
	
	public void setExamesCompVisualPrescricao(
			Set<AbsExameComponenteVisualPrescricao> examesCompVisualPrescricao) {
		this.examesCompVisualPrescricao = examesCompVisualPrescricao;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GTC_SEQ")
	public AelGrupoResultadoCodificado getGrupoResultadoCodificado() {
		return grupoResultadoCodificado;
	}

	public void setGrupoResultadoCodificado(
			AelGrupoResultadoCodificado grupoResultadoCodificado) {
		this.grupoResultadoCodificado = grupoResultadoCodificado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GCA_SEQ")
	public AelGrupoResultadoCaracteristica getGrupoResultadoCaracteristica() {
		return grupoResultadoCaracteristica;
	}

	public void setGrupoResultadoCaracteristica(
			AelGrupoResultadoCaracteristica grupoResultadoCaracteristica) {
		this.grupoResultadoCaracteristica = grupoResultadoCaracteristica;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		if (!(obj instanceof AelCampoLaudo)) {
			return false;
		}
		AelCampoLaudo other = (AelCampoLaudo) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}


	@PrePersist
	@PreUpdate
	@SuppressWarnings({"PMD.NPathComplexity", "unused"})
	private void realizarValidacoes() {

		//(TIPO_CAMPO = 'E' AND IND_PERMITE_DIGITACAO IN ('S','N')) 
		//OR (TIPO_CAMPO IN ('T','M','Q','R','V','H') AND IND_PERMITE_DIGITACAO = 'N')
		//OR (TIPO_CAMPO IN ('N','A','C') AND IND_PERMITE_DIGITACAO = 'S')
		//AEL_CAL_CK12
		if(!(DominioTipoCampoCampoLaudo.E.equals(this.tipoCampo) && (Boolean.FALSE.equals(this.permiteDigitacao)||Boolean.TRUE.equals(this.permiteDigitacao))
			||((DominioTipoCampoCampoLaudo.T.equals(this.tipoCampo)
				||DominioTipoCampoCampoLaudo.M.equals(this.tipoCampo)
				||DominioTipoCampoCampoLaudo.Q.equals(this.tipoCampo)
				||DominioTipoCampoCampoLaudo.R.equals(this.tipoCampo)
				||DominioTipoCampoCampoLaudo.V.equals(this.tipoCampo)
				||DominioTipoCampoCampoLaudo.H.equals(this.tipoCampo)
				)&& Boolean.FALSE.equals(this.permiteDigitacao))
			||((DominioTipoCampoCampoLaudo.N.equals(this.tipoCampo)
					||DominioTipoCampoCampoLaudo.A.equals(this.tipoCampo)
					||DominioTipoCampoCampoLaudo.C.equals(this.tipoCampo)
					)&& Boolean.TRUE.equals(this.permiteDigitacao))	
			)){
			throw new BaseRuntimeException(AelCampoLaudoModelExceptionCode.AEL_CAL_CK12);
		}
		
		//(GCA_SEQ IS NOT NULL AND GTC_SEQ IS NULL) 
		//OR (GCA_SEQ IS NULL  AND GTC_SEQ IS NOT NULL) 
		//OR (GCA_SEQ IS NULL  AND GTC_SEQ IS NULL)   
		//TODO alterar a validacao quando o mapeamento for trocado pelo pojo em questao (ainda nao existe).
		if(!((this.grupoResultadoCaracteristica != null && this.grupoResultadoCodificado == null)
				||(this.grupoResultadoCaracteristica == null && this.grupoResultadoCodificado != null)
				||(this.grupoResultadoCaracteristica == null && this.grupoResultadoCodificado == null)
				)){
			throw new BaseRuntimeException(AelCampoLaudoModelExceptionCode.AEL_CAL_CK4);
		}
		
	    //(TIPO_CAMPO <> 'C' AND GCA_SEQ IS NULL AND GTC_SEQ IS NULL)
		//OR (TIPO_CAMPO = 'C' AND GCA_SEQ IS NOT NULL AND GTC_SEQ IS NULL)
		//OR (TIPO_CAMPO = 'C' AND GCA_SEQ IS NULL AND GTC_SEQ IS NOT NULL)       
		//TODO alterar a validacao quando o mapeamento for trocado pelo pojo em questao (ainda nao existe).
		if(!((!DominioTipoCampoCampoLaudo.C.equals(this.tipoCampo) && this.grupoResultadoCaracteristica == null && this.grupoResultadoCodificado == null)
				||(DominioTipoCampoCampoLaudo.C.equals(this.tipoCampo) && this.grupoResultadoCaracteristica != null && this.grupoResultadoCodificado == null)
				||(DominioTipoCampoCampoLaudo.C.equals(this.tipoCampo) && this.grupoResultadoCaracteristica == null && this.grupoResultadoCodificado != null)
		)){
			throw new BaseRuntimeException(AelCampoLaudoModelExceptionCode.AEL_CAL_CK5);
		}
		
       //(IND_FLUXO = 'N')
   	   //OR (IND_FLUXO = 'S' AND ORDEM IS NOT NULL AND ORDEM > 0) 
		if(!((Boolean.FALSE.equals(this.fluxo))
				||(Boolean.TRUE.equals(this.fluxo) && this.ordem != null && this.ordem > 0))){
			
			throw new BaseRuntimeException(AelCampoLaudoModelExceptionCode.AEL_CAL_CK6);
		}
		
		//(IND_CANCELA_ITEM_DEPT = 'S' AND TIPO_CAMPO = 'C')
		//OR (IND_CANCELA_ITEM_DEPT = 'N' AND TIPO_CAMPO in ('T','N','A','E','C','M','Q','R','V','H'))
		if(!((Boolean.TRUE.equals(this.cancelaItemDept) && DominioTipoCampoCampoLaudo.C.equals(this.tipoCampo))
			||(Boolean.FALSE.equals(this.cancelaItemDept) &&
					(DominioTipoCampoCampoLaudo.T.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.N.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.A.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.E.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.C.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.M.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.Q.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.R.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.V.equals(this.tipoCampo)
					|| DominioTipoCampoCampoLaudo.H.equals(this.tipoCampo)
					)
				)
			)){
			throw new BaseRuntimeException(AelCampoLaudoModelExceptionCode.AEL_CAL_CK8);
		}
	}
	
	public enum Fields {
		SEQ("seq"),
		NOME("nome"),
		TIPO_CAMPO("tipoCampo"),
		FLUXO("fluxo"),
		SITUACAO("situacao"),
		GRUPO_RESULTADO_CARACTERISTICA("grupoResultadoCaracteristica"),
		GCA_SEQ("grupoResultadoCaracteristica.seq"),
		GRUPO_RESULTADO_CODIFICADO("grupoResultadoCodificado"),//Alterar mapeamento qdo o pojo AEL_GRUPO_RESUL_CODIFICADOS for criado.
		GTC_SEQ("grupoResultadoCodificado.seq"),
		SERVIDOR("servidor"),
		CRIADO_EM("criadoEm"),
		ORDEM("ordem"),
		CANCELA_ITEM_DEPT("cancelaItemDept"),
		NOME_SUMARIO("nomeSumario"),
		PERTENCE_APAC("pertenceApac"),
		DIVIDE_POR_MIL("dividePorMil"),
		PERMITE_DIGITACAO("permiteDigitacao"),
		PERTENCE_CONTADOR("pertenceContador"),
		PERTENCE_ABS("pertenceAbs"),
		ESPECIALIDADE_CAMPO_LAUDO("especialidadeCampoLaudo"),
		SERVIDOR_CAMPO_LAUDO("servidorCampoLaudo"),
		EXAMES_COMP_VISUAL_PRESCRICAO("examesCompVisualPrescricao"),
		VALORES_NORMALIDADE("valoresNormalidade"),
		PARAMETROS_CAMPOS_LAUDO("parametrosCamposLaudo"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}

	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public Set<AelValorNormalidCampo> getValoresNormalidade() {
		return valoresNormalidade;
	}

	public void setValoresNormalidade(
			Set<AelValorNormalidCampo> valoresNormalidade) {
		this.valoresNormalidade = valoresNormalidade;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public Set<AelEspecialidadeCampoLaudo> getEspecialidadeCampoLaudo() {
		return especialidadeCampoLaudo;
	}

	public void setEspecialidadeCampoLaudo(Set<AelEspecialidadeCampoLaudo> especialidadeCampoLaudo) {
		this.especialidadeCampoLaudo = especialidadeCampoLaudo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public Set<AelServidorCampoLaudo> getServidorCampoLaudo() {
		return servidorCampoLaudo;
	}

	public void setServidorCampoLaudo(Set<AelServidorCampoLaudo> servidorCampoLaudo) {
		this.servidorCampoLaudo = servidorCampoLaudo;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public Set<AelCampoUsoFaturamento> getCampoUsoFaturamento() {
		return campoUsoFaturamento;
	}
	
	public void setCampoUsoFaturamento(Set<AelCampoUsoFaturamento> campoUsoFaturamento) {
		this.campoUsoFaturamento = campoUsoFaturamento;
	}

	public void setParametrosCamposLaudo(Set<AelParametroCamposLaudo> parametrosCamposLaudo) {
		this.parametrosCamposLaudo = parametrosCamposLaudo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public Set<AelParametroCamposLaudo> getParametrosCamposLaudo() {
		return parametrosCamposLaudo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campoLaudo")
	public List<MtxExameUltResults> getMtxExameUltResults() {
		return mtxExameUltResults;
	}

	public void setMtxExameUltResults(List<MtxExameUltResults> mtxExameUltResults) {
		this.mtxExameUltResults = mtxExameUltResults;
	}
	
}
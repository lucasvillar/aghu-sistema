package br.gov.mec.aghu.ambulatorio.vo;

// Generated 23/12/2010 11:18:44 by Hibernate Tools 3.2.5.Beta

import java.io.Serializable;
import java.util.Date;

/**
 * VRapServidorConselho generated by micael.coutinho
 */
public class VRapServidorConselhoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4159936994505367690L;
	/**
	 * 
	 */
	private Integer matricula;
	private Short vinCodigo;
	private Integer cctCodigo;
	private Integer cctCodigoAtua;
	private Integer ocaCodigo;
	private Short grfCodigo;
	private String nome;
	private String sigla;
	private Short cprCodigo;
	private String nroRegConselho;
	private String cprSigla;
	private String indSituacao;
	private Date dtInicioVinculo;
	private Date dtFimVinculo;
	private String conselhoSigla;
	private Long cpf;
	
	
	public VRapServidorConselhoVO() {
	}

	public enum Fields {
		MATRICULA("matricula"),VIN_CODIGO("vinCodigo"),CCT_CODIGO("cctCodigo"),
		CCT_CODIGO_ATUA("cctCodigoAtua"),OCA_CODIGO("ocaCodigo"),GRF_CODIGO("grfCodigo"),
		NOME("nome"),SIGLA("sigla"),CPR_CODIGO("cprCodigo"),NRO_REG_CONSELHO("nroRegConselho"),
		CPR_SIGLA("cprSigla"),IND_SITUACAO("indSituacao"),DT_INICIO_VINCULO("dtInicioVinculo"),
		DT_FIM_VINCULO("dtFimVinculo"),CONSELHO_SIGLA("conselhoSigla"),CPF("cpf");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
	
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	public Integer getCctCodigoAtua() {
		return this.cctCodigoAtua;
	}

	public void setCctCodigoAtua(Integer cctCodigoAtua) {
		this.cctCodigoAtua = cctCodigoAtua;
	}

	public Integer getOcaCodigo() {
		return this.ocaCodigo;
	}

	public void setOcaCodigo(Integer ocaCodigo) {
		this.ocaCodigo = ocaCodigo;
	}

	public Short getGrfCodigo() {
		return this.grfCodigo;
	}

	public void setGrfCodigo(Short grfCodigo) {
		this.grfCodigo = grfCodigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Short getCprCodigo() {
		return this.cprCodigo;
	}

	public void setCprCodigo(Short cprCodigo) {
		this.cprCodigo = cprCodigo;
	}

	public String getNroRegConselho() {
		return this.nroRegConselho;
	}

	public void setNroRegConselho(String nroRegConselho) {
		this.nroRegConselho = nroRegConselho;
	}

	public String getCprSigla() {
		return this.cprSigla;
	}

	public void setCprSigla(String cprSigla) {
		this.cprSigla = cprSigla;
	}

	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public Date getDtInicioVinculo() {
		return this.dtInicioVinculo;
	}

	public void setDtInicioVinculo(Date dtInicioVinculo) {
		this.dtInicioVinculo = dtInicioVinculo;
	}

	public Date getDtFimVinculo() {
		return this.dtFimVinculo;
	}

	public void setDtFimVinculo(Date dtFimVinculo) {
		this.dtFimVinculo = dtFimVinculo;
	}

	public String getConselhoSigla() {
		return this.conselhoSigla;
	}

	public void setConselhoSigla(String conselhoSigla) {
		this.conselhoSigla = conselhoSigla;
	}

	public Long getCpf() {
		return this.cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Short getVinCodigo() {
		return vinCodigo;
	}

	public void setVinCodigo(Short vinCodigo) {
		this.vinCodigo = vinCodigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result
				+ ((nroRegConselho == null) ? 0 : nroRegConselho.hashCode());
		result = prime * result
				+ ((vinCodigo == null) ? 0 : vinCodigo.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VRapServidorConselhoVO other = (VRapServidorConselhoVO) obj;
		if (matricula == null) {
			if (other.matricula != null){
				return false;
			}
		}else if (!matricula.equals(other.matricula)){
			return false;
		}
		if (nroRegConselho == null) {
			if (other.nroRegConselho != null){
				return false;
			}
		} else if (!nroRegConselho.equals(other.nroRegConselho)){
			return false;
		}
		if (vinCodigo == null) {
			if (other.vinCodigo != null){
				return false;
			}
		} else if (!vinCodigo.equals(other.vinCodigo)){
			return false;
		}
		return true;
	}
	
}
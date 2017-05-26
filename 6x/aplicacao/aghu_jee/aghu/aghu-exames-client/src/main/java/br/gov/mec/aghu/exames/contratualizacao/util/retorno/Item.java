//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.05 at 05:23:50 PM BRT 
//


package br.gov.mec.aghu.exames.contratualizacao.util.retorno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}idExterno"/>
 *         &lt;element ref="{}siglaExame"/>
 *         &lt;element ref="{}materialAnalise"/>
 *         &lt;element ref="{}unidadeExecutora"/>
 *         &lt;element ref="{}idAmostra"/>
 *         &lt;element ref="{}numeroUnico"/>
 *         &lt;element ref="{}dataNumeroUnico"/>
 *         &lt;element ref="{}mensagemErro"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idExterno",
    "siglaExame",
    "materialAnalise",
    "unidadeExecutora",
    "idAmostra",
    "numeroUnico",
    "dataNumeroUnico",
    "mensagemErro"
})
@XmlRootElement(name = "item")
public class Item {

    @XmlElement(required = true)
    protected String idExterno;
    @XmlElement(required = true)
    protected String siglaExame;
    @XmlElement(required = true)
    protected String materialAnalise;
    @XmlElement(required = true)
    protected String unidadeExecutora;
    @XmlElement(required = true)
    protected String idAmostra;
    @XmlElement(required = true)
    protected String numeroUnico;
    @XmlElement(required = true)
    protected String dataNumeroUnico;
    @XmlElement(required = true)
    protected String mensagemErro;

    /**
     * Gets the value of the idExterno property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getIdExterno() {
        return idExterno;
    }

    /**
     * Sets the value of the idExterno property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setIdExterno(String value) {
        this.idExterno = value;
    }

    /**
     * Gets the value of the siglaExame property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getSiglaExame() {
        return siglaExame;
    }

    /**
     * Sets the value of the siglaExame property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setSiglaExame(String value) {
        this.siglaExame = value;
    }

    /**
     * Gets the value of the materialAnalise property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getMaterialAnalise() {
        return materialAnalise;
    }

    /**
     * Sets the value of the materialAnalise property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setMaterialAnalise(String value) {
        this.materialAnalise = value;
    }

    /**
     * Gets the value of the unidadeExecutora property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getUnidadeExecutora() {
        return unidadeExecutora;
    }

    /**
     * Sets the value of the unidadeExecutora property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setUnidadeExecutora(String value) {
        this.unidadeExecutora = value;
    }

    /**
     * Gets the value of the idAmostra property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getIdAmostra() {
        return idAmostra;
    }

    /**
     * Sets the value of the idAmostra property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setIdAmostra(String value) {
        this.idAmostra = value;
    }

    /**
     * Gets the value of the numeroUnico property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getNumeroUnico() {
        return numeroUnico;
    }

    /**
     * Sets the value of the numeroUnico property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setNumeroUnico(String value) {
        this.numeroUnico = value;
    }

    /**
     * Gets the value of the dataNumeroUnico property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getDataNumeroUnico() {
        return dataNumeroUnico;
    }

    /**
     * Sets the value of the dataNumeroUnico property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setDataNumeroUnico(String value) {
        this.dataNumeroUnico = value;
    }

    /**
     * Gets the value of the mensagemErro property.
     * 
     * @return
     *     possible String is
     *     {@link String }
     *     
     */
    public String getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Sets the value of the mensagemErro property.
     * 
     * @param value
     *     allowed String is
     *     {@link String }
     *     
     */
    public void setMensagemErro(String value) {
        this.mensagemErro = value;
    }

    @Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }
}
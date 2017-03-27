
package com.mycompany.horus.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProdutoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProdutoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="principioAtivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroVolumeMedicamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoVolumeMedicamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroConcentracaoMedicamento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricaoConcentracaoMedicamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoFormaFarmaceutica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadeFornecimento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricaoLista" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricaoUnidadeConsumo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoType", namespace = "http://servicos.saude.gov.br/schema/horus/v1r0/produto", propOrder = {
    "codigo",
    "numero",
    "principioAtivo",
    "numeroVolumeMedicamento",
    "descricaoVolumeMedicamento",
    "numeroConcentracaoMedicamento",
    "descricaoConcentracaoMedicamento",
    "descricaoFormaFarmaceutica",
    "unidadeFornecimento",
    "descricaoLista",
    "descricaoUnidadeConsumo",
    "descricao"
})
public class ProdutoType {

    protected int codigo;
    @XmlElement(required = true)
    protected String numero;
    protected String principioAtivo;
    protected String numeroVolumeMedicamento;
    protected String descricaoVolumeMedicamento;
    @XmlElement(required = true)
    protected String numeroConcentracaoMedicamento;
    protected String descricaoConcentracaoMedicamento;
    protected String descricaoFormaFarmaceutica;
    @XmlElement(required = true)
    protected String unidadeFornecimento;
    @XmlElement(required = true)
    protected String descricaoLista;
    @XmlElement(required = true)
    protected String descricaoUnidadeConsumo;
    @XmlElement(required = true, nillable = true)
    protected String descricao;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade principioAtivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    /**
     * Define o valor da propriedade principioAtivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipioAtivo(String value) {
        this.principioAtivo = value;
    }

    /**
     * Obtém o valor da propriedade numeroVolumeMedicamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVolumeMedicamento() {
        return numeroVolumeMedicamento;
    }

    /**
     * Define o valor da propriedade numeroVolumeMedicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVolumeMedicamento(String value) {
        this.numeroVolumeMedicamento = value;
    }

    /**
     * Obtém o valor da propriedade descricaoVolumeMedicamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoVolumeMedicamento() {
        return descricaoVolumeMedicamento;
    }

    /**
     * Define o valor da propriedade descricaoVolumeMedicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoVolumeMedicamento(String value) {
        this.descricaoVolumeMedicamento = value;
    }

    /**
     * Obtém o valor da propriedade numeroConcentracaoMedicamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConcentracaoMedicamento() {
        return numeroConcentracaoMedicamento;
    }

    /**
     * Define o valor da propriedade numeroConcentracaoMedicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConcentracaoMedicamento(String value) {
        this.numeroConcentracaoMedicamento = value;
    }

    /**
     * Obtém o valor da propriedade descricaoConcentracaoMedicamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoConcentracaoMedicamento() {
        return descricaoConcentracaoMedicamento;
    }

    /**
     * Define o valor da propriedade descricaoConcentracaoMedicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoConcentracaoMedicamento(String value) {
        this.descricaoConcentracaoMedicamento = value;
    }

    /**
     * Obtém o valor da propriedade descricaoFormaFarmaceutica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoFormaFarmaceutica() {
        return descricaoFormaFarmaceutica;
    }

    /**
     * Define o valor da propriedade descricaoFormaFarmaceutica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoFormaFarmaceutica(String value) {
        this.descricaoFormaFarmaceutica = value;
    }

    /**
     * Obtém o valor da propriedade unidadeFornecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeFornecimento() {
        return unidadeFornecimento;
    }

    /**
     * Define o valor da propriedade unidadeFornecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeFornecimento(String value) {
        this.unidadeFornecimento = value;
    }

    /**
     * Obtém o valor da propriedade descricaoLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoLista() {
        return descricaoLista;
    }

    /**
     * Define o valor da propriedade descricaoLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoLista(String value) {
        this.descricaoLista = value;
    }

    /**
     * Obtém o valor da propriedade descricaoUnidadeConsumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoUnidadeConsumo() {
        return descricaoUnidadeConsumo;
    }

    /**
     * Define o valor da propriedade descricaoUnidadeConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoUnidadeConsumo(String value) {
        this.descricaoUnidadeConsumo = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

}

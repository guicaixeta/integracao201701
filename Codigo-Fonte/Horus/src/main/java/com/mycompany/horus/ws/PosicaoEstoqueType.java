
package com.mycompany.horus.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PosicaoEstoqueType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PosicaoEstoqueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cnes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="municipio" type="{http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio}MunicipioType"/&gt;
 *         &lt;element name="produto" type="{http://servicos.saude.gov.br/schema/horus/v1r0/produto}ProdutoType"/&gt;
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="situacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosicaoEstoqueType", namespace = "http://servicos.saude.gov.br/schema/horus/v1r0/posicaoestoque", propOrder = {
    "cnes",
    "municipio",
    "produto",
    "quantidade",
    "situacao"
})
public class PosicaoEstoqueType {

    @XmlElement(required = true)
    protected String cnes;
    @XmlElement(required = true)
    protected MunicipioType municipio;
    @XmlElement(required = true)
    protected ProdutoType produto;
    protected long quantidade;
    @XmlElement(required = true)
    protected String situacao;

    /**
     * Obtém o valor da propriedade cnes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnes() {
        return cnes;
    }

    /**
     * Define o valor da propriedade cnes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnes(String value) {
        this.cnes = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioType }
     *     
     */
    public MunicipioType getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioType }
     *     
     */
    public void setMunicipio(MunicipioType value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoType }
     *     
     */
    public ProdutoType getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoType }
     *     
     */
    public void setProduto(ProdutoType value) {
        this.produto = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     */
    public long getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     */
    public void setQuantidade(long value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacao(String value) {
        this.situacao = value;
    }

}

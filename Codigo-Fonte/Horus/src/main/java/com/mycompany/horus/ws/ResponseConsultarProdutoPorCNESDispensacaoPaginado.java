
package com.mycompany.horus.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="posicaoEstoque" type="{http://servicos.saude.gov.br/schema/horus/v1r0/posicaoestoque}PosicaoEstoqueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paginacao" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}PaginacaoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "posicaoEstoque",
    "paginacao"
})
@XmlRootElement(name = "responseConsultarProdutoPorCNESDispensacaoPaginado")
public class ResponseConsultarProdutoPorCNESDispensacaoPaginado {

    protected List<PosicaoEstoqueType> posicaoEstoque;
    @XmlElement(required = true)
    protected PaginacaoType paginacao;

    /**
     * Gets the value of the posicaoEstoque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posicaoEstoque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosicaoEstoque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosicaoEstoqueType }
     * 
     * 
     */
    public List<PosicaoEstoqueType> getPosicaoEstoque() {
        if (posicaoEstoque == null) {
            posicaoEstoque = new ArrayList<PosicaoEstoqueType>();
        }
        return this.posicaoEstoque;
    }

    /**
     * Obtém o valor da propriedade paginacao.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoType }
     *     
     */
    public PaginacaoType getPaginacao() {
        return paginacao;
    }

    /**
     * Define o valor da propriedade paginacao.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoType }
     *     
     */
    public void setPaginacao(PaginacaoType value) {
        this.paginacao = value;
    }

}

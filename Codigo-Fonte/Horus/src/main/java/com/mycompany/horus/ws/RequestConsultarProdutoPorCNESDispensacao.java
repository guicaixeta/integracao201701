
package com.mycompany.horus.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="cnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "cnes"
})
@XmlRootElement(name = "requestConsultarProdutoPorCNESDispensacao")
public class RequestConsultarProdutoPorCNESDispensacao {

    protected int cnes;

    /**
     * Obtém o valor da propriedade cnes.
     * 
     */
    public int getCnes() {
        return cnes;
    }

    /**
     * Define o valor da propriedade cnes.
     * 
     */
    public void setCnes(int value) {
        this.cnes = value;
    }

}

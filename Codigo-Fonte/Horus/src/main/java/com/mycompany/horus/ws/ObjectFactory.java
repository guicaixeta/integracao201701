
package com.mycompany.horus.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gatewayedi.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PosicaoEstoque_QNAME = new QName("http://servicos.saude.gov.br/schema/horus/v1r0/posicaoestoque", "PosicaoEstoque");
    private final static QName _Produto_QNAME = new QName("http://servicos.saude.gov.br/schema/horus/v1r0/produto", "Produto");
    private final static QName _Municipio_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", "Municipio");
    private final static QName _UF_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r1/uf", "UF");
    private final static QName _Paginacao_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao", "Paginacao");
    private final static QName _Mensagem_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/mensagem", "Mensagem");
    private final static QName _MSFalhaIdentificador_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha", "identificador");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gatewayedi.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestConsultarPosicaoEstoquePorCNES }
     * 
     */
    public RequestConsultarPosicaoEstoquePorCNES createRequestConsultarPosicaoEstoquePorCNES() {
        return new RequestConsultarPosicaoEstoquePorCNES();
    }

    /**
     * Create an instance of {@link ResponseConsultarPosicaoEstoquePorCNES }
     * 
     */
    public ResponseConsultarPosicaoEstoquePorCNES createResponseConsultarPosicaoEstoquePorCNES() {
        return new ResponseConsultarPosicaoEstoquePorCNES();
    }

    /**
     * Create an instance of {@link PosicaoEstoqueType }
     * 
     */
    public PosicaoEstoqueType createPosicaoEstoqueType() {
        return new PosicaoEstoqueType();
    }

    /**
     * Create an instance of {@link RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo }
     * 
     */
    public RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo createRequestConsultarPosicaoEstoquePorCNESPrincipioAtivo() {
        return new RequestConsultarPosicaoEstoquePorCNESPrincipioAtivo();
    }

    /**
     * Create an instance of {@link ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo }
     * 
     */
    public ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo createResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo() {
        return new ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivo();
    }

    /**
     * Create an instance of {@link RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado }
     * 
     */
    public RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado createRequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado() {
        return new RequestConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado();
    }

    /**
     * Create an instance of {@link PaginacaoType }
     * 
     */
    public PaginacaoType createPaginacaoType() {
        return new PaginacaoType();
    }

    /**
     * Create an instance of {@link ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado }
     * 
     */
    public ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado createResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado() {
        return new ResponseConsultarPosicaoEstoquePorCNESPrincipioAtivoPaginado();
    }

    /**
     * Create an instance of {@link RequestConsultarProdutoPorCNESDispensacao }
     * 
     */
    public RequestConsultarProdutoPorCNESDispensacao createRequestConsultarProdutoPorCNESDispensacao() {
        return new RequestConsultarProdutoPorCNESDispensacao();
    }

    /**
     * Create an instance of {@link ResponseConsultarProdutoPorCNESDispensacao }
     * 
     */
    public ResponseConsultarProdutoPorCNESDispensacao createResponseConsultarProdutoPorCNESDispensacao() {
        return new ResponseConsultarProdutoPorCNESDispensacao();
    }

    /**
     * Create an instance of {@link RequestConsultarProdutoPorCNESDispensacaoPaginado }
     * 
     */
    public RequestConsultarProdutoPorCNESDispensacaoPaginado createRequestConsultarProdutoPorCNESDispensacaoPaginado() {
        return new RequestConsultarProdutoPorCNESDispensacaoPaginado();
    }

    /**
     * Create an instance of {@link ResponseConsultarProdutoPorCNESDispensacaoPaginado }
     * 
     */
    public ResponseConsultarProdutoPorCNESDispensacaoPaginado createResponseConsultarProdutoPorCNESDispensacaoPaginado() {
        return new ResponseConsultarProdutoPorCNESDispensacaoPaginado();
    }

    /**
     * Create an instance of {@link ProdutoType }
     * 
     */
    public ProdutoType createProdutoType() {
        return new ProdutoType();
    }

    /**
     * Create an instance of {@link MunicipioType }
     * 
     */
    public MunicipioType createMunicipioType() {
        return new MunicipioType();
    }

    /**
     * Create an instance of {@link UFType }
     * 
     */
    public UFType createUFType() {
        return new UFType();
    }

    /**
     * Create an instance of {@link MSFalha }
     * 
     */
    public MSFalha createMSFalha() {
        return new MSFalha();
    }

    /**
     * Create an instance of {@link MensagemType }
     * 
     */
    public MensagemType createMensagemType() {
        return new MensagemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosicaoEstoqueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/horus/v1r0/posicaoestoque", name = "PosicaoEstoque")
    public JAXBElement<PosicaoEstoqueType> createPosicaoEstoque(PosicaoEstoqueType value) {
        return new JAXBElement<PosicaoEstoqueType>(_PosicaoEstoque_QNAME, PosicaoEstoqueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/horus/v1r0/produto", name = "Produto")
    public JAXBElement<ProdutoType> createProduto(ProdutoType value) {
        return new JAXBElement<ProdutoType>(_Produto_QNAME, ProdutoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MunicipioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", name = "Municipio")
    public JAXBElement<MunicipioType> createMunicipio(MunicipioType value) {
        return new JAXBElement<MunicipioType>(_Municipio_QNAME, MunicipioType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r1/uf", name = "UF")
    public JAXBElement<UFType> createUF(UFType value) {
        return new JAXBElement<UFType>(_UF_QNAME, UFType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginacaoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao", name = "Paginacao")
    public JAXBElement<PaginacaoType> createPaginacao(PaginacaoType value) {
        return new JAXBElement<PaginacaoType>(_Paginacao_QNAME, PaginacaoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensagemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/mensagem", name = "Mensagem")
    public JAXBElement<MensagemType> createMensagem(MensagemType value) {
        return new JAXBElement<MensagemType>(_Mensagem_QNAME, MensagemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha", name = "identificador", scope = MSFalha.class)
    public JAXBElement<String> createMSFalhaIdentificador(String value) {
        return new JAXBElement<String>(_MSFalhaIdentificador_QNAME, String.class, MSFalha.class, value);
    }

}

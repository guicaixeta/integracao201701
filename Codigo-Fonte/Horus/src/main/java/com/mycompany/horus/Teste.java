/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;
import javax.xml.soap.*;
import javax.xml.namespace.QName;

public class Teste {

    public static void main(String args[]) throws Exception {
        // Creating SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Sending SOAP Message to SOAP Server
        String url = "https://servicos.saude.gov.br/horus/v1r0/EstoqueService?WSDL";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

        // print SOAP Response
        System.out.println("Response SOAP Message:");
        soapResponse.writeTo(System.out);

        soapConnection.close();
    }

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPHeader header = soapMessage.getSOAPHeader();
        SOAPBody body = soapMessage.getSOAPBody();

        QName bodyName = new QName(
                "requestConsultarPosicaoPorEstoqueCNES", "est");

        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);
        QName name = new QName("cnes","cnes","est");
        SOAPElement symbol = bodyElement.addChildElement(name);
        symbol.addTextNode("CNES");


        /*
        String serverURI = "http://schemas.xmlsoap.org/wsdl/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();

        envelope.addNamespaceDeclaration("example", serverURI);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "VerifyEmail");
        headers.addHeader("Teste", "valor de teste");

        */
        soapMessage.saveChanges();

        /* Print the request message */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }

}

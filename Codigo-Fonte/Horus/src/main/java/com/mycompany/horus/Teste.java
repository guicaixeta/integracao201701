/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author aluno
 */
public class Teste {

    private static SOAPMessage createSoapRequest() throws Exception {

        MessageFactory messageFactory = MessageFactory.newInstance();

        SOAPMessage soapMessage = messageFactory.createMessage();

        SOAPPart soapPart = soapMessage.getSOAPPart();

        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
        soapEnvelope.addNamespaceDeclaration("end", "http://endpoint.concretepage.com/");

        SOAPBody soapBody = soapEnvelope.getBody();

        SOAPElement soapElement = soapBody.addChildElement("getWelcomeMsg", "end");
        SOAPElement element1 = soapElement.addChildElement("arg0");
        element1.addTextNode("EveryOne");

        soapMessage.saveChanges();

        System.out.println("----------SOAP Request------------");
        soapMessage.writeTo(System.out);
        return soapMessage;
    }

    private static void createSoapResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.println("\n----------SOAP Response-----------");

        File file = new File("horusExit.txt");
        FileOutputStream fop = new FileOutputStream(file);

        if (!file.exists()) {
            file.createNewFile();
        }


        StreamResult result = new StreamResult(file);
        transformer.transform(sourceContent, result);
        
        fop.flush();
        fop.close();
    }

    public static void main(String args[]) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            String url = "https://servicos.saude.gov.br/horus/v1r0/EstoqueService?WSDL";

            SOAPMessage soapRequest = createSoapRequest();
            SOAPMessage soapResponse = soapConnection.call(soapRequest, url);

            createSoapResponse(soapResponse);
            soapConnection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

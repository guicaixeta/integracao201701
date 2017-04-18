/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;

import java.io.IOException;
import java.io.StringReader;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author aluno
 */
public class XmlParser {

    public Set<String> getServices(String xmlString) {

        InputSource source = new InputSource(new StringReader(xmlString));

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        DocumentBuilder builder;

        try {
            builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(source);
            XPath xpath = XPathFactory.newInstance().newXPath();

            // Buscando serviços disponiveis
            NodeList n = xmlDocument.getElementsByTagName("wsdl:portType");
            String soapNameSpace = xpath.evaluate("//wsdl:operation", xmlDocument);
            String servicesFlag = "wsdl:portType";
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {

        }

        return null;
    }
}

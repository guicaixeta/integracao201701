/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author aluno
 */
public class XmlParser {

    public Set<String> getServices(String filePath) {

        try {
            File arquivo = new File(filePath);

            FileInputStream file = new FileInputStream(arquivo);
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            builderFactory.setNamespaceAware(true);
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file);
            XPath xpath = XPathFactory.newInstance().newXPath();
            
            NodeList nl = xmlDocument.getElementsByTagName("wsdl:portType");
            nl = nl.item(0).getChildNodes();
            Node n;
            
            for(int i = 0; i < nl.getLength(); i++){
                n = nl.item(i);
                NodeList sub = n.getChildNodes();
                
                System.out.println("Node: " + i);
                for(int j = 0; j < sub.getLength(); j++){
                    Node subn = sub.item(j);
                    System.out.println(subn.getNodeName());
                    System.out.println(subn.getTextContent());
                    
                }
                System.out.println("-------------------");
            }
            
            "a".toString();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }
}

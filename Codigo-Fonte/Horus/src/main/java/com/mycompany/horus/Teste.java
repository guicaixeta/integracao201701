/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;

public class Teste {


    public static void main(String[] args) throws Exception {
        String soapBody="<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:est=\"http://servicos.saude.gov.br/horus/v1r0/EstoqueService\">\n" +
                " <soap:Header>\n" +
                " <wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wsswssecurity-secext-1.0.xsd\">\n" +
                " <wsse:UsernameToken wsu:Id=\"Id-0001334008436683-000000002c4a1908-1\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" +
                " <wsse:Username>HORUS</wsse:Username>\n" +
                " <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wssusername-token-profile-1.0#PasswordText\">SENHA</wsse:Password>\n" +
                " </wsse:UsernameToken>\n" +
                " </wsse:Security>\n" +
                " </soap:Header>\n" +
                " <soap:Body><est:requestConsultarPosicaoEstoquePorCNES>\n" +
                " <est:cnes>7604041</est:cnes>\n" +
                " </est:requestConsultarPosicaoEstoquePorCNES>\n" +
                " </soap:Body>\n" +
                "</soap:Envelope>\n";
        try {
            // Get target URL

            CloseableHttpClient httpclient = HttpClientBuilder.create().build();
            StringEntity strEntity = new StringEntity(soapBody,"UTF-8");
            strEntity.setContentType("text/xml");
            HttpPost post = new HttpPost("https://servicos.saude.gov.br/horus/v1r0/EstoqueService");
            post.setEntity(strEntity);

            // Execute request
            HttpResponse response = httpclient.execute(post);
            HttpEntity respEntity = response.getEntity();
            String resp = EntityUtils.toString(respEntity);
            if (respEntity != null) {
                System.out.println("Response:");
                System.out.println(resp);
                //Changing response to Xml file
                stringToDom(resp);
                XmlParser test = new XmlParser();
                test.getServices("teste.xml");
            } else {
                System.out.println("No Response");
            }
        }
        catch (Exception e) {
            System.out.println("Other exception = " + e.toString());
        }
    }


    public static void stringToDom(String xmlSource)
            throws IOException {
        java.io.FileWriter fw = new java.io.FileWriter("teste.xml");
        fw.write(xmlSource);
        fw.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author aluno
 */
public class ServiceListener {

    private final String SERVICE_URL = "https://servicos.saude.gov.br/horus/v1r0/EstoqueService?WSDL";
    private final String PARAMETERS_URL = "https://servicos.saude.gov.br/horus/v1r0/EstoqueService?WSDL&type=XSD&file=schema%3A0f2d6d57-3e90-42d7-851c-c68e7b203254";

    public List<HorusService> getHorusServicesList() {

        try {
            String xml = this.getWsdlServicos();
            XmlParser test = new XmlParser();
            test.getServices(xml);
                
        } catch (IOException ex) {
        }

        return null;
    }

    private String getWsdlServicos() throws IOException {
        String resp;
        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(SERVICE_URL);
        HttpResponse response = httpclient.execute(post);
        HttpEntity respEntity = response.getEntity();
        resp = EntityUtils.toString(respEntity);
        return resp;
    }

    private String getWsdlParametros() throws IOException {
        String resp;
        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(PARAMETERS_URL);
        HttpResponse response = httpclient.execute(post);
        HttpEntity respEntity = response.getEntity();
        resp = EntityUtils.toString(respEntity);
        return resp;
    }
}

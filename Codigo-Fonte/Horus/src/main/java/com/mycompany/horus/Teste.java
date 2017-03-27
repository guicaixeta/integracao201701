
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horus;

import com.mycompany.horus.ws.EstoqueFault;
import com.mycompany.horus.ws.EstoqueService;
import com.mycompany.horus.ws.EstoqueServicePortType;
import com.mycompany.horus.ws.MSFalha;
import com.mycompany.horus.ws.RequestConsultarPosicaoEstoquePorCNES;
import com.mycompany.horus.ws.ResponseConsultarPosicaoEstoquePorCNES;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
/**
 *
 * @author pedro
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EstoqueService service = new EstoqueService();
        EstoqueServicePortType port = service.getEstoqueServicePort();
        RequestConsultarPosicaoEstoquePorCNES requestConsultarPosicaoEstoquePorCNES = new RequestConsultarPosicaoEstoquePorCNES();
        requestConsultarPosicaoEstoquePorCNES.setCnes(1234567);

        ResponseConsultarPosicaoEstoquePorCNES teste;
        try {
            teste = port.consultarPosicaoEstoquePorCNES(requestConsultarPosicaoEstoquePorCNES);
            System.out.println(teste.toString());
        } catch (EstoqueFault ex) {
            MSFalha x = ex.getFaultInfo();
            System.out.println();
        }

        //AuthSOAPHeader authSOAPHeader = new AuthSOAPHeader();
        //authSOAPHeader.setUser("test");
        //authSOAPHeader.setPassword("test");
        //String payerList = port.ping(authSOAPHeader);
        //Service service = Service.create(HorusFactory._Produto_QNAME);        
        //Dispatch<Source> disp = service.createDispatch(
        //        HorusFactory._Produto_QNAME, Source.class, Service.Mode.PAYLOAD
        //);
        //"a".toString();
        //Source request = new StreamSource("<hello/>");
        //Source response = disp.invoke(request);
    }
}

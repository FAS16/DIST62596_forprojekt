/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spillerbase;


import galgeleg.GalgeInterface;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Naming;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author fahadali
 */
public class Spillerbase {
    
        public static void main(String[] args) throws Exception {
        URL url = new URL("http://130.225.170.248:9901/spillerbase?wsdl");
        QName qname = new QName("http://spillerbase/", "SpillerbaseImplService");
        Service service = Service.create(url, qname);
        SpillerbaseI s = service.getPort(SpillerbaseI.class);
        
        
        
        //logik
    }
    
}

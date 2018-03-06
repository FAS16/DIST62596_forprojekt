
package galgeleg;

import java.net.URL;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class GalgeKlient 
{
    public static void main(String[] args) throws Exception 
    {
        URL url = new URL("http://130.225.170.248:9901/galgespil?wsdl");
        QName qname = new QName("http://galgeleg/", "GalgelogikService");
        Service service = Service.create(url, qname);
	GalgeInterface k = service.getPort(GalgeInterface.class);
        

        //Galgelogik spil = new Galgelogik(); // ændr således at logik udføres fra server
        
        boolean aktiv = true;
        String gæt;
        Scanner tastatur = new Scanner(System.in);
        
        
        
        while (aktiv)
        {
            System.out.println("Indtast  bogstav");
            gæt = tastatur.next();
            k.gætBogstav(gæt);   
            System.out.println(k.outputTilKlient());
            k.logStatus();       
            System.out.println(k.outputTilKlient());   
            System.out.println(k.visFigur());
            if (k.erSpilletSlut()) aktiv = false;
        }
      
        System.out.println("Spillet er slut!");
       
    }
}


package galgeleg;

import java.net.URL;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class GalgeKlient 
{
    
    public static void main(String[] args) throws Exception 
    {
        URL url = new URL("http://130.225.170.248:9901/galgespil?wsdl");
        //URL url = new URL("http://localhost:9901/galgespil?wsdl");
        QName qname = new QName("http://galgeleg/", "GalgelogikService");
        Service service = Service.create(url, qname);
	GalgeInterface g = service.getPort(GalgeInterface.class);
        //Galgelogik spil = new Galgelogik(); // ændr således at logik udføres fra server
       
        System.out.println("=========== Velkommen ===========");
        System.out.println("\n===== Log ind for at spille =====");
        Scanner tastatur = new Scanner(System.in);
        String brugernavn, kodeord;
        
        while(true){
            
        System.out.println("\nBrugernavn:");
        brugernavn = tastatur.nextLine();
        System.out.println("\nAdgangskode:");
        kodeord = tastatur.nextLine();
        
        if(g.logInd(brugernavn, kodeord)){
            //Indlæs spildata
            break;
        }
        
        else System.out.println("Forkert brugernavn eller adgangskode, prøv igen.");
            
        }
        
        String gæt;
        System.out.println("\n======== Spillet starter ========");
        while (true) {
            System.out.println(g.outputTilKlient());
            System.out.println("\nIndtast bogstav (dit gæt)");
            gæt = tastatur.next();
            g.gætBogstav(gæt);   
            System.out.println(g.outputTilKlient());
            g.logStatus();       
            System.out.println(g.outputTilKlient());   
            System.out.println(g.visFigur());
            if (g.erSpilletSlut()) break;
              
        }
      
        System.out.println("Spillet er slut!");
       
    }
}

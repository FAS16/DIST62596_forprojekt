package galgeleg;

import java.net.MalformedURLException;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;


//Op til server
public class GalgeServer 
{
    public static void main(String[] args) throws MalformedURLException 
    {
        System.out.println("publicerer galgespil");
        
        GalgeInterface g = new Galgelogik();   
        // Ipv6-addressen [::] svarer til Ipv4-adressen 0.0.0.0, der matcher alle maskinens netkort og IP-adresser
        Endpoint.publish("http://[::]:9901/galgespil", g);
        System.out.println("galgespil publiceret.");
        
    }
}

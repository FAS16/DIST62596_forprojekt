package galgeleg;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


//Op til server
public class GalgeServer 
{ 
 
    private static int PORTNUMMER = 1099;
    private String RMIURL = "rmi://130.225.170.248/GalgeServer";
    
    public static void main(String[] args) throws RemoteException, MalformedURLException 
    {
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        
        GalgeInterface g = new GalgeImpl();
        Naming.rebind("RMIURL", g);
        System.out.println("Galgeserver startet");
        
    }
}

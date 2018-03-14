package spillerbase;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import spillerbase.SpillerbaseI;
import spillerbase.SpillerbaseImpl;

//Op til server
public class SpillerbaseServer {

    private static int PORTNUMMER = 1099;
    private static String RMIURL = "rmi://130.225.170.248/SpillerbaseServer";

    public static void main(String[] args) throws RemoteException, MalformedURLException {

        try {
            LocateRegistry.createRegistry(PORTNUMMER);
            System.out.println("java RMI register dannet, med port: " + PORTNUMMER);
        } catch (RemoteException e) {
            System.out.println("java RMI register er allerede dannet.");
        }

        SpillerbaseI spil = new SpillerbaseImpl();
        Naming.rebind(RMIURL, spil);
        System.out.println("RMI server startet");

    }
}

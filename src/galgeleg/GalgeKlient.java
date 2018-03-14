package galgeleg;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class GalgeKlient {

    public static void main(String[] args) throws Exception {

//        GalgeInterface spil = (GalgeInterface) Naming.lookup("rmi://localhost:1099/GalgeServer");
        GalgeInterface spil = (GalgeInterface) Naming.lookup("rmi://130.225.170.248:1099/GalgeServer");

        boolean aktiv = true;
        String gæt;
        Scanner tastatur = new Scanner(System.in);

        while (aktiv) {
            System.out.println("Indtast bogstav:");
            gæt = tastatur.next();
            spil.gætBogstav(gæt);
            System.out.println(spil.outputTilKlient());
            spil.logStatus();
            System.out.println(spil.outputTilKlient());
            if (spil.erSpilletSlut()) {
                aktiv = false;
            }
        }

        System.out.println("Spillet afsluttes/Forbindelse til server lukkes");

    }
}

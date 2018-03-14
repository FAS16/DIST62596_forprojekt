/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spillerbase;

import brugerautorisation.data.Bruger;
import brugerautorisation.transport.rmi.Brugeradmin;
import galgeleg.DRRest;
import galgeleg.GalgeImpl;
import galgeleg.GalgeInterface;
import galgeleg.Galgelogik;
import java.net.URL;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author fahadali
 */
public class SpillerbaseKlient {

    private static final String URL = "http://130.225.170.248:9901/spillerbase?wsdl";
    private static SpillerbaseI spil;

    private static String brugernavn, adgangskode;
    private static ArrayList<String> spillere;
    private static GalgeInterface g;

    public static void main(String[] args) throws Exception {

        spil = (SpillerbaseI) Naming.lookup("rmi://130.225.170.248:1099/SpillerbaseServer");

        spillere = spil.hentAlleSpillere();
        System.out.println("Alle spillere " + spillere);

        Scanner tastatur = new Scanner(System.in);
        System.out.println("=========== Velkommen ===========");
        System.out.println("\n===== Log ind for at spille =====");

        while (true) {

            System.out.println("\nBrugernavn:");
            brugernavn = tastatur.nextLine();
            System.out.println("Adgangskode:");
            adgangskode = tastatur.nextLine();

            if (logInd()) {
                break;
            } else {
                System.out.println("Forkert brugernavn eller adgangskode, prøv igen.");
            }

        }

        startSpil();

    }

    public static void startSpil() throws RemoteException {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("\n======== Spillet starter ========");

        if (g.isSessionHentet()) {
            System.out.println("Din forrige session er hentet, du fortsætter hvor du slap.\n");
            System.out.println(g.outputTilKlient());
            System.out.println(g.visFigur());

        } else {
            System.out.println("Starter nyt spil");
           // g.hentOrdFraDr();
            
            
        }

        while (true) {
            g.logStatus();
            System.out.println("\nIndtast bogstav (dit gæt)");
            g.gætBogstav(tastatur.next());
            System.out.println(g.outputTilKlient());
            g.logStatus();
            System.out.println(g.outputTilKlient());
            System.out.println(g.visFigur());
            if (g.erSpilletSlut()) {
                g.nulstil();
                break;

            }

        }

        System.out.println("SPILLET ER SLUT!");

    }

    public static boolean logInd() {

        try {
            System.out.println(brugernavn + " logger ind.");
            Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
            Bruger b = ba.hentBruger(brugernavn, adgangskode);

            if (!spillere.contains(brugernavn)) {
                spil.registrerSpiller(brugernavn);

            } else {
                System.out.println("Velkommen tilbage " + brugernavn);
            }

            g = spil.findSpil(brugernavn);
            g.setBrugerAdmin(ba);
            g.setBrugernavn(brugernavn);
            g.setAdgangskode(adgangskode);

            if (!g.getBrugteBogstaver().equals("")) {
                System.out.println("[Aktiv session fundet - henter og sender til klienten])"); // ikke- færdiggjort spil
                g.hentSidsteSession();
            } else if (g.getBrugteBogstaver().equals("")) {
                System.out.println("[Ingen session at hente, ny session startes]"); //færdiggjort/nyt spil/første spil
                g.setSessionHentet(false);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
            return false;
        }

        return true;
    }

}

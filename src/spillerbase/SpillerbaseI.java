/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spillerbase;

import galgeleg.GalgeImpl;
import galgeleg.GalgeInterface;
import galgeleg.Galgelogik;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author fahadali
 */

public interface SpillerbaseI extends java.rmi.Remote {


    GalgeInterface findSpil(String navn) throws java.rmi.RemoteException;;


    ArrayList<String> hentAlleSpillere() throws java.rmi.RemoteException;


    void registrerSpiller(String navn) throws java.rmi.RemoteException;;

}

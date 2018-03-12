/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spillerbase;

import galgeleg.GalgeInterface;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author fahadali
 */
@WebService
public interface SpillerbaseI {

    @WebMethod
    GalgeInterface findGalgespiller(String brugernavn);

    @WebMethod
    ArrayList<String> hentAlleKontonavne();

    @WebMethod
    void registrérKonto(String brugernavn, GalgeInterface g) throws java.rmi.RemoteException;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spillerbase;

import galgeleg.GalgeInterface;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.jws.WebService;

/**
 *
 * @author fahadali
 */

@WebService(endpointInterface = "spillerbase.SpillerbaseI")
public class SpillerbaseImpl implements SpillerbaseI {

    @Override
    public GalgeInterface findGalgespiller(String brugernavn) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> hentAlleKontonavne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrérKonto(String brugernavn, GalgeInterface g) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

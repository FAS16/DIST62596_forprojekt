package galgeleg;


import brugerautorisation.transport.rmi.Brugeradmin;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

/**
 *
 * @author fahadali
 */
public class GalgeImpl extends UnicastRemoteObject implements GalgeInterface {

    private Galgelogik logik;

    public GalgeImpl() throws RemoteException {

        logik = new Galgelogik();
    }

    @Override
    public boolean isSessionHentet() throws RemoteException {
        return logik.isSessionHentet();
    }

    @Override
    public void setSessionHentet(boolean sessionHentet) throws RemoteException {
        logik.setSessionHentet(sessionHentet);
    }

    @Override
    public String getBrugteBogstaver() throws RemoteException {
        return logik.getBrugteBogstaver();
    }

    @Override
    public String getSynligtOrd() throws RemoteException {
        
        return logik.getSynligtOrd();
        
    }

    @Override
    public String getOrdet() throws RemoteException {
        return logik.getOrdet();
    }

    @Override
    public int getAntalForkerteBogstaver() throws RemoteException {
        return logik.getAntalForkerteBogstaver();
    }

    @Override
    public boolean erSidsteBogstavKorrekt() throws RemoteException {
        return logik.erSidsteBogstavKorrekt();
    }

    @Override
    public boolean erSpilletVundet() throws RemoteException {
        return logik.erSpilletVundet();
    }

    @Override
    public boolean erSpilletTabt() throws RemoteException {
        return logik.erSpilletTabt();
    }

    @Override
    public boolean erSpilletSlut() throws RemoteException {
        return logik.erSpilletSlut();
    }

    @Override
    public void setOrdet(String ordet) throws RemoteException {
        logik.setOrdet(ordet);
    }

    @Override
    public void setBrugteBogstaver(String brugteBogstaver) throws RemoteException {
        logik.setBrugteBogstaver(brugteBogstaver);
    }

    @Override
    public void setSynligtOrd(String synligtOrd) throws RemoteException {
        logik.setSynligtOrd(synligtOrd);
    }

    @Override
    public void setAntalForkerteBogstaver(int antalForkerteBogstaver) throws RemoteException {
        logik.setAntalForkerteBogstaver(antalForkerteBogstaver);
    }

    @Override
    public void setSidsteBogstavVarKorrekt(boolean sidsteBogstavVarKorrekt) throws RemoteException {
        logik.setSidsteBogstavVarKorrekt(sidsteBogstavVarKorrekt);
    }

    @Override
    public void setSpilletErVundet(boolean spilletErVundet) throws RemoteException {
        logik.setSpilletErVundet(spilletErVundet);
    }

    @Override
    public void setSpilletErTabt(boolean spilletErTabt) throws RemoteException {
        logik.setSpilletErTabt(spilletErTabt);
    }

    @Override
    public void nulstil() throws RemoteException {
            logik.nulstil();
    }

    @Override
    public void opdaterSynligtOrd() throws RemoteException {
        logik.opdaterSynligtOrd();
    }

    @Override
    public void gætBogstav(String bogstav) throws RemoteException {
        logik.gætBogstav(bogstav);
    }

    @Override
    public void logStatus() throws RemoteException {
        logik.logStatus();
    }

    @Override
    public String hentUrl(String url) throws RemoteException {
        try {
            return logik.hentUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(GalgeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

//    @Override
//    public void hentOrdFraDr() throws RemoteException {
//        
//            logik.hentOrdFraDR();
//       
//    }

    @Override
    public void logInd(String brugernavn, String adgangskode) throws RemoteException {
        logik.logInd(brugernavn, adgangskode);
    }

    @Override
    public String visFigur() throws RemoteException {
        return logik.visFigur();
    }

    @Override
    public String outputTilKlient() throws RemoteException {
        return logik.outputTilKlient();
    }

    @Override
    public void hentSidsteSession() throws RemoteException {
        logik.hentSidsteSession();
    }

    @Override
    public Brugeradmin getBrugerAdmin() throws RemoteException {
        return logik.getBrugerAdmin();
    }

    @Override
    public void setBrugerAdmin(Brugeradmin brugerAdmin) throws RemoteException {
        logik.setBrugerAdmin(brugerAdmin);
    }

    @Override
    public String getBrugernavn() throws RemoteException {
       return logik.getBrugernavn();
    }

    @Override
    public void setBrugernavn(String brugernavn) throws RemoteException {
       logik.setBrugernavn(brugernavn);
    }

    @Override
    public String getAdgangskode() throws RemoteException {
      return logik.getAdgangskode();
    }

    @Override
    public void setAdgangskode(String adgangskode) throws RemoteException {
      logik.setAdgangskode(adgangskode);
    }

    
    

}

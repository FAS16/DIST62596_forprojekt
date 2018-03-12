package galgeleg;

import java.io.IOException;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface GalgeInterface {

    @WebMethod
    boolean isSessionHentet();

    @WebMethod
    void setSessionHentet(boolean sessionHentet);

    @WebMethod
    String getBrugteBogstaver();

    @WebMethod
    String getSynligtOrd();

    @WebMethod
    String getOrdet();

    @WebMethod
    int getAntalForkerteBogstaver();

    @WebMethod
    boolean erSidsteBogstavKorrekt();

    @WebMethod
    boolean erSpilletVundet();

    @WebMethod
    boolean erSpilletTabt();

    @WebMethod
    boolean erSpilletSlut();

    @WebMethod
    void setOrdet(String ordet);

    @WebMethod
    void setBrugteBogstaver(String brugteBogstaver);

    @WebMethod
    void setSynligtOrd(String synligtOrd);

    @WebMethod
    void setAntalForkerteBogstaver(int antalForkerteBogstaver);

    @WebMethod
    void setSidsteBogstavVarKorrekt(boolean sidsteBogstavVarKorrekt);

    @WebMethod
    void setSpilletErVundet(boolean spilletErVundet);

    @WebMethod
    void setSpilletErTabt(boolean spilletErTabt);

    @WebMethod
    void nulstil();

    @WebMethod
    void opdaterSynligtOrd();

    @WebMethod
    void gætBogstav(String bogstav);

    @WebMethod
    public void logStatus();

    @WebMethod
    String hentUrl(String url) throws IOException;

    @WebMethod
    void hentOrdFraDr() throws Exception;

    @WebMethod
    boolean logInd(String brugernavn, String adgangskode) throws Exception;

    @WebMethod
    public String visFigur();

    @WebMethod
    String outputTilKlient();

    @WebMethod
    public void hentSidsteSession();

}

package galgeleg; 
    
import javax.jws.WebMethod;
import javax.jws.WebService;

//Op til server
@WebService
public interface GalgeInterface 
{
    @WebMethod void nulstil();              			
    @WebMethod void logStatus();            
    @WebMethod void gætBogstav(String bogstav);  
    @WebMethod boolean erSpilletSlut();     
    @WebMethod String outputTilKlient();  
    @WebMethod String visFigur();
  
}

package brugerautorisation.transport.rmi;

import brugerautorisation.data.Diverse;
import brugerautorisation.data.Bruger;
import java.rmi.Naming;

public class Brugeradminklient {
	public static void main(String[] arg) throws Exception {
//		Brugeradmin ba =(Brugeradmin) Naming.lookup("rmi://localhost/brugeradmin");
		Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");

    ba.sendGlemtAdgangskodeEmail("s165159", "Skift dit pswd bri");
		//System.out.println("Fik bruger = " + ba);
		//System.out.println("Data: " + Diverse.toString(ba));
		// ba.sendEmail("jacno", "xxx", "Hurra det virker!", "Jeg er så glad");

//		Object ekstraFelt = ba.getEkstraFelt("s160344", "Linux123", "hobby");
//		System.out.println("Brugerens hobby er: " + ekstraFelt);
//
//		ba.setEkstraFelt("s123456", "kode1xyz", "hobby", "Tennis og programmering"); // Skriv noget andet her
//
//		String webside = (String) ba.getEkstraFelt("s123456", "kodeen test, husk at skifte kode");
		//ba.ændrAdgangskode("s123456", "kode1xyz", "kode1xyz");
		//Bruger b = ba.hentBruger("s1644", "Linux123");
                
                
		//System.out.println("Fik bruger = " + b);
		//System.out.println("Data: " + Diverse.toString(b));
		// ba.sendEmail("jacno", "xxx", "Hurra det virker!", "Jeg er så glad");

//		Object ekstraFelt = ba.getEkstraFelt("s160344", "Linux123", "hobby");
//		System.out.println("Brugerens hobby er: " + ekstraFelt);
//
//		ba.setEkstraFelt("s123456", "kode1xyz", "hobby", "Tennis og programmering"); // Skriv noget andet her
//
//		String webside = (String) ba.getEkstraFelt("s123456", "kode1xyz", "webside");
//		System.out.println("Brugerens webside er: " + webside);
	}
}

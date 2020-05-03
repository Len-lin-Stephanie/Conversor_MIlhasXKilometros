package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Conversor {
	
	//De Kilometros para milhas >> mi = km * 0,62137
	//De milhas para kilometros >> km = mi / 0,62137
	
	@WebMethod
	public String milhasParaKilometros(@WebParam(name="milhas") float milhas) {
		float kilometros = milhas / (float) 0.62137;
		return kilometros + " Km";
	}
	
	@WebMethod
	public String kilometrosParaMilhas(@WebParam(name="kilometros") float kilometros) {
		float milhas = kilometros * (float) 0.62137;
		return milhas + " mi";
	}

}

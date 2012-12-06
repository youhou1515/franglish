package franglish.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AuthentificationWebService {

	@WebMethod
	public Boolean getAccess(@WebParam(name = "login") String login,
			@WebParam(name = "password") String password);

}

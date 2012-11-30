package wsinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AuthentificationService {

	@WebMethod
	public Boolean getAccess(@WebParam(name = "login") String login,
			@WebParam(name = "password") String password);

}

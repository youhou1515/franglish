package wsimplementation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import wsinterface.AuthentificationService;

@WebService(endpointInterface = "wsinterface.AuthentificationService", serviceName = "authentificationService")
public class AuthentificationServiceImpl implements AuthentificationService {

	@Override
	@WebMethod
	public Boolean getAccess(@WebParam(name = "login") String login,
			@WebParam(name = "password") String password) {

		if (login.equals("tarzan") && password.equals("jane"))
			return Boolean.TRUE;
		return Boolean.FALSE;
	}

}

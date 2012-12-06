package franglish.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "franglish.webservice.AuthentificationWebService", serviceName = "authentificationWebService")
public class AuthentificationWebServiceImpl implements
		AuthentificationWebService {

	@Override
	public Boolean getAccess(String login, String password) {
		if (login.equals("tarzan") && password.equals("jane"))
			return Boolean.TRUE;
		return Boolean.FALSE;
	}

}

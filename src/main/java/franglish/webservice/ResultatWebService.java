package franglish.webservice;

public class ResultatWebService {

	private boolean isOK;
	private String erreur;
	
	public ResultatWebService(boolean pIsOK, String pErreur) {
		isOK = pIsOK;
		erreur = pErreur;
	}

	public boolean isOK() {
		return isOK;
	}

	public void setOK(boolean isOK) {
		this.isOK = isOK;
	}

	public String getErreur() {
		return erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}
	
	
	
}

package bean;

public class MotBean {
	
	private int idMot;
	private String anglais;
	private String francais1;
	private String francais2;
	
	private ThemeBean theme;
	
	public MotBean() {
	}
	
	public MotBean(int pIdMot, String pAnglais, String pFrancais1, String pFrancais2) {
		idMot = pIdMot;
		anglais = pAnglais;
		francais1 = pFrancais1;
		francais2 = pFrancais2;
	}
	
	public MotBean(int pIdMot, String pAnglais, String pFrancais1, String pFrancais2, ThemeBean pTheme) {
		this(pIdMot, pAnglais, pFrancais1, pFrancais2);
		theme = pTheme;
	}

	public int getIdMot() {
		return idMot;
	}

	public void setIdMot(int idMot) {
		this.idMot = idMot;
	}

	public String getAnglais() {
		return anglais;
	}

	public void setAnglais(String anglais) {
		this.anglais = anglais;
	}

	public String getFrancais1() {
		return francais1;
	}

	public void setFrancais1(String francais1) {
		this.francais1 = francais1;
	}

	public String getFrancais2() {
		return francais2;
	}

	public void setFrancais2(String francais2) {
		this.francais2 = francais2;
	}
	
	public ThemeBean getTheme() {
		return theme;
	}

	public void setTheme(ThemeBean theme) {
		this.theme = theme;
	}

}

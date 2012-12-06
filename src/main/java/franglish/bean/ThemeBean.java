package franglish.bean;

public class ThemeBean {
	
	private int idTheme;
	private String theme;
	
	public ThemeBean() {		
	}
	
	public ThemeBean(int pIdTheme, String pTheme) {
		idTheme = pIdTheme;
		theme = pTheme;
	}

	public int getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	
}

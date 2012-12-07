package franglish.service;

import java.util.List;

import franglish.bean.ThemeBean;

public interface VocabulaireService {

	public void viderToutLeVocabulaire();

	public List<ThemeBean> getListTheme();
	
	public int insertThemesOnDatabase();
}

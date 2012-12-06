package franglish.dao;

import java.util.List;

import franglish.bean.MotBean;
import franglish.bean.ThemeBean;
import franglish.webservice.ResultatWebService;


public interface VocabulaireDao {

	public void viderToutLeVocabulaire();
	

	public List<ThemeBean> getListTheme();
	
	/************************************/
	

	public ThemeBean getTheme(String pTheme);
	

	public ResultatWebService addTheme(String pTheme);
	

	public ResultatWebService deleteTheme(String pTheme);
	

	public ResultatWebService modifyTheme(String pThemeOld, String pThemeNew);
	
	/************************************/
	

	public List<ThemeBean> getListMotsDunTheme(String pTheme);
	

	public void addListMotsDunTheme(List<MotBean> pListMots);
	

	public void modifyMotDunTheme(MotBean pMotBeanOld, MotBean pMotBeanNew);
	

	public void deleteMotDunTheme(MotBean pMotBeanOld);
}

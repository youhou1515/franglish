package dao;

import java.util.List;

import wsimplementation.ResultatService;
import bean.MotBean;
import bean.ThemeBean;

public interface VocabulaireDao {

	public void viderToutLeVocabulaire();
	

	public List<ThemeBean> getListTheme();
	
	/************************************/
	

	public ThemeBean getTheme(String pTheme);
	

	public ResultatService addTheme(String pTheme);
	

	public ResultatService deleteTheme(String pTheme);
	

	public ResultatService modifyTheme(String pThemeOld, String pThemeNew);
	
	/************************************/
	

	public List<ThemeBean> getListMotsDunTheme(String pTheme);
	

	public void addListMotsDunTheme(List<MotBean> pListMots);
	

	public void modifyMotDunTheme(MotBean pMotBeanOld, MotBean pMotBeanNew);
	

	public void deleteMotDunTheme(MotBean pMotBeanOld);
}

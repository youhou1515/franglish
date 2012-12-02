package wsinterface;

import java.util.List;

import javax.jws.WebMethod;

import wsimplementation.ResultatService;
import bean.MotBean;
import bean.ThemeBean;

public interface VocabulaireService {
	
	@WebMethod
	public void viderToutLeVocabulaire();
		
	@WebMethod
	public List<ThemeBean> getListTheme();
	
	/************************************/
	
	@WebMethod
	public ThemeBean getTheme(String pTheme);
	
	@WebMethod
	public ResultatService addTheme(String pTheme);
	
	@WebMethod
	public ResultatService deleteTheme(String pTheme);
	
	@WebMethod
	public ResultatService modifyTheme(String pThemeOld, String pThemeNew);
	
	/************************************/
	
	@WebMethod
	public List<ThemeBean> getListMotsDunTheme(String pTheme);
	
	@WebMethod
	public void addListMotsDunTheme(List<MotBean> pListMots);
	
	@WebMethod
	public void modifyMotDunTheme(MotBean pMotBeanOld, MotBean pMotBeanNew);
	
	@WebMethod
	public void deleteMotDunTheme(MotBean pMotBeanOld);
	
}

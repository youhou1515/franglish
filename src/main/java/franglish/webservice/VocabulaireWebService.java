package franglish.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import franglish.bean.ThemeBean;


@WebService
public interface VocabulaireWebService {
	
	@WebMethod
	public void viderToutLeVocabulaire();
		
	@WebMethod
	public List<ThemeBean> getListTheme();
	
	@WebMethod
	public int insertThemesOnDatabase();
	
	/************************************/
	
//	@WebMethod
//	public ThemeBean getTheme(@WebParam(name = "theme") String pTheme);
//	
//	@WebMethod
//	public @WebResult ResultatService addTheme(@WebParam(name = "theme") String pTheme);
//	
//	@WebMethod
//	public ResultatService deleteTheme(@WebParam(name = "theme") String pTheme);
//	
//	@WebMethod
//	public ResultatService modifyTheme(@WebParam(name = "themeOld") String pThemeOld, @WebParam(name = "themeNew")  String pThemeNew);
//	
//	/************************************/
//	
//	@WebMethod
//	public List<ThemeBean> getListMotsDunTheme(@WebParam(name = "theme") String pTheme);
//	
//	@WebMethod
//	public void addListMotsDunTheme(@WebParam(name = "listMots") List<MotBean> pListMots);
//	
//	@WebMethod
//	public void modifyMotDunTheme(@WebParam(name = "motBeanOld") MotBean pMotBeanOld, @WebParam(name = "motBeanNew") MotBean pMotBeanNew);
//	
//	@WebMethod
//	public void deleteMotDunTheme(@WebParam(name = "motBeanToDelete") MotBean pMotBeanToDelete);
	
}

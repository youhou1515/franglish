package franglish.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import franglish.bean.ThemeBean;
import franglish.service.VocabulaireService;


@Service(value="vocabulaireWebService")
@WebService(endpointInterface = "franglish.webservice.VocabulaireWebService", serviceName = "vocabulaireWebService")
public class VocabulaireWebServiceImpl implements VocabulaireWebService {
	
	@Autowired
	private VocabulaireService vocabulaireService;

	@Override
	public void viderToutLeVocabulaire() {
		vocabulaireService.viderToutLeVocabulaire();
	}

	@Override
	public List<ThemeBean> getListTheme() {
		return vocabulaireService.getListTheme();
	}
	
	public void setVocabulaireService(VocabulaireService vocabulaireService) {
		this.vocabulaireService = vocabulaireService;
	}

	@Override
	public int insertThemesOnDatabase() {
		return vocabulaireService.insertThemesOnDatabase();
	}


//	@Override
//	public ThemeBean getTheme(String pTheme) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResultatService addTheme(String pTheme) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResultatService deleteTheme(String pTheme) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResultatService modifyTheme(String pThemeOld, String pThemeNew) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<ThemeBean> getListMotsDunTheme(String pTheme) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void addListMotsDunTheme(List<MotBean> pListMots) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void modifyMotDunTheme(MotBean pMotBeanOld, MotBean pMotBeanNew) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void deleteMotDunTheme(MotBean pMotBeanOld) {
//		// TODO Auto-generated method stub
//
//	}

}

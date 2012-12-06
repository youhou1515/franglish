package franglish.webservice;

import java.util.List;

import javax.jws.WebService;

import franglish.bean.ThemeBean;
import franglish.service.VocabulaireService;



@WebService(endpointInterface = "franglish.webservice.VocabulaireWebService", serviceName = "vocabulaireWebService")
public class VocabulaireWebServiceImpl implements VocabulaireWebService {
	
	VocabulaireService vocabulaireService;

	@Override
	public void viderToutLeVocabulaire() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ThemeBean> getListTheme() {
		
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("franglish");
//		context.refresh();
//		
//		VocabulaireMetier vocabulaireMetierLocal = (VocabulaireMetier) context.getBean("VocabulaireMetier.class");
//		vocabulaireMetierLocal.getListTheme();
		
		
		return vocabulaireService.getListTheme();
	}

	public void setVocabulaireService(VocabulaireService vocabulaireService) {
		this.vocabulaireService = vocabulaireService;
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

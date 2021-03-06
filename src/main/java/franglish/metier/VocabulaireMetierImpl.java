package franglish.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import franglish.bean.MotBean;
import franglish.bean.ThemeBean;
import franglish.dao.VocabulaireDao;
import franglish.webservice.ResultatWebService;

@Component
public class VocabulaireMetierImpl implements VocabulaireMetier {

	@Autowired
	VocabulaireDao vocabulaireDao;

	public VocabulaireDao getVocabulaireDao() {
		return vocabulaireDao;
	}

	public void setVocabulaireDao(VocabulaireDao vocabulaireDao) {
		this.vocabulaireDao = vocabulaireDao;
	}

	@Override
	public void viderToutLeVocabulaire() {
		vocabulaireDao.viderToutLeVocabulaire();
	}

	@Override
	public List<ThemeBean> getListTheme() {
		return vocabulaireDao.getListTheme();
	}

	@Override
	public ThemeBean getTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultatWebService addTheme(String pTheme) {
		return vocabulaireDao.addTheme(pTheme);
	}

	@Override
	public ResultatWebService deleteTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultatWebService modifyTheme(String pThemeOld, String pThemeNew) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ThemeBean> getListMotsDunTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListMotsDunTheme(List<MotBean> pListMots) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyMotDunTheme(MotBean pMotBeanOld, MotBean pMotBeanNew) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMotDunTheme(MotBean pMotBeanOld) {
		// TODO Auto-generated method stub

	}

	@Override
	public int insertThemesOnDatabase() {
		return vocabulaireDao.insertThemesOnDatabase();
	}

}

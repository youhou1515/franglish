package metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.VocabulaireDao;

import wsimplementation.ResultatService;
import bean.MotBean;
import bean.ThemeBean;

@Component
public class VocabulaireMetierImpl implements VocabulaireMetier {

	@Autowired
	VocabulaireDao vocabulaireDao;
	
	@Override
	public void viderToutLeVocabulaire() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ThemeBean> getListTheme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ThemeBean getTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultatService addTheme(String pTheme) {
		return vocabulaireDao.addTheme(pTheme);
	}

	@Override
	public ResultatService deleteTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultatService modifyTheme(String pThemeOld, String pThemeNew) {
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

}

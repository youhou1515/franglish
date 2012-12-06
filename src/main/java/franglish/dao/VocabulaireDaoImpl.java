package franglish.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import franglish.bean.MotBean;
import franglish.bean.ThemeBean;
import franglish.webservice.ResultatWebService;

@Repository
public class VocabulaireDaoImpl implements VocabulaireDao {

	@Override
	public void viderToutLeVocabulaire() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ThemeBean> getListTheme() {
		List<ThemeBean> listTheme = new ArrayList<ThemeBean>();
		ThemeBean theme1 = new ThemeBean(1, "le temps");
		ThemeBean theme2 = new ThemeBean(2, "le futur");
		ThemeBean theme3 = new ThemeBean(3, "le cinéma");
		ThemeBean theme4 = new ThemeBean(4, "le travail");
		ThemeBean theme5 = new ThemeBean(5, "le voyage");
		ThemeBean theme6 = new ThemeBean(6, "la famille");
		listTheme.add(theme1);
		listTheme.add(theme2);
		listTheme.add(theme3);
		listTheme.add(theme4);
		listTheme.add(theme5);
		listTheme.add(theme6);
		return listTheme;
	}

	@Override
	public ThemeBean getTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultatWebService addTheme(String pTheme) {
		// TODO Auto-generated method stub
		return null;
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

}
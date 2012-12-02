package dao;

import java.util.List;

import metier.VocabulaireMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wsimplementation.ResultatService;
import bean.MotBean;
import bean.ThemeBean;

@Service
public class VocabulaireDaoImpl implements VocabulaireDao {

	@Autowired
	VocabulaireMetier vocabulaireMetier;
	
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
		// TODO Auto-generated method stub
		return vocabulaireMetier.addTheme(pTheme);
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
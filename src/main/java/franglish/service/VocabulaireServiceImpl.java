package franglish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import franglish.bean.ThemeBean;
import franglish.metier.VocabulaireMetier;

@Service
public class VocabulaireServiceImpl implements VocabulaireService {

	@Autowired
	VocabulaireMetier vocabulaireMetier;

	@Override
	public void viderToutLeVocabulaire() {
		vocabulaireMetier.viderToutLeVocabulaire();
	}

	@Override
	public List<ThemeBean> getListTheme() {
		return vocabulaireMetier.getListTheme();
	}
	
	

	public void setVocabulaireMetier(VocabulaireMetier vocabulaireMetier) {
		this.vocabulaireMetier = vocabulaireMetier;
	}

	@Override
	public int insertThemesOnDatabase() {
		return vocabulaireMetier.insertThemesOnDatabase();
	}
}

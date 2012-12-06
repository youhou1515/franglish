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
		// TODO Auto-generated method stub

	}

	@Override
	public List<ThemeBean> getListTheme() {

		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext();
		// context.scan("franglish");
		// context.refresh();
		//
		// VocabulaireMetier vocabulaireMetierLocal = (VocabulaireMetier)
		// context.getBean("VocabulaireMetier.class");
		// vocabulaireMetierLocal.getListTheme();

		return vocabulaireMetier.getListTheme();
	}

	public void setVocabulaireMetier(VocabulaireMetier vocabulaireMetier) {
		this.vocabulaireMetier = vocabulaireMetier;
	}
}

package franglish.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import franglish.bean.MotBean;
import franglish.bean.ThemeBean;
import franglish.webservice.ResultatWebService;


public class VocabulaireDaoImpl implements VocabulaireDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void viderToutLeVocabulaire() {
		// TODO Auto-generated method stub

	}

	public List<ThemeBean> getListThemeTest() {
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



	@SuppressWarnings("unchecked")
	@Override
	public List<ThemeBean> getListTheme() {
		
		List<ThemeBean> listThemes = jdbcTemplate.query("select * from THEMES",
		    new RowMapper() {
		        public ThemeBean mapRow(final ResultSet rs, final int rowNum) throws SQLException {
		        	final ThemeBean theme = new ThemeBean();
		        	theme.setIdTheme(rs.getInt("id"));
		            theme.setTheme(rs.getString("theme"));
		            return theme;
		        }
		    });
		
		return listThemes;
	}
	
//	public Collection findAllActors() {
//	    return this.jdbcTemplate.query( "select first_name, surname from t_actor", new ActorMapper());
//	}
//
//	private static final class ActorMapper implements RowMapper {
//
//	    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//	        Actor actor = new Actor();
//	        actor.setFirstName(rs.getString("first_name"));
//	        actor.setSurname(rs.getString("surname"));
//	        return actor;
//	    }
//	}
	
//	Collection actors = this.jdbcTemplate.query(
//		    "select first_name, surname from t_actor",
//		    new RowMapper() {
//
//		        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//		            Actor actor = new Actor();
//		            actor.setFirstName(rs.getString("first_name"));
//		            actor.setSurname(rs.getString("surname"));
//		            return actor;
//		        }
//		    });

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
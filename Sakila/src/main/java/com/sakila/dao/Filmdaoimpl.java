package com.sakila.dao;

import java.util.*;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.sakila.pojo.Film;
import com.sakila.pojo.Language;

//import com.sakila.pojo.Film;
//import com.sakila.pojo.Language;

public class Filmdaoimpl implements Filmdao{
	
	private Filmdao film;
	
	public Filmdao getFilm() {
		return film;
	}
	
	public void setFilm(Filmdao film) {
		this.film = film;
	}
	
	
	
	Configuration config = new Configuration();
	ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.configure().getProperties()).build();
	SessionFactory factory=config.buildSessionFactory(service);
	
	@SuppressWarnings({"rawtypes"})
	@Override
	public HashMap<Object, Object> dataLoading(Integer film_id, String title, String description, String release_year,
			String rating, String special_features, String language_id, String director) {
		Session session =factory.openSession();
		Transaction tx =null;
		try {
			System.out.println("dao impl");
			tx=session.beginTransaction();
			String hql="FROM Film";
			Query query = session.createQuery(hql);
			List result=query.list();
			System.out.print(result);
			tx.commit();
			
			HashMap<Object, Object> hm = new HashMap<Object, Object>();
			hm.put("data", query.list());
			System.out.println("daoimpl"+hm);
			return hm;
		} catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}

	@Override
	public String addRow(String title, String description, String release_year, String rating, String special_features,
			String language, String director) {
		
		Session session =factory.openSession();
		Transaction tx =null;
		try {
			System.out.println("dao impl");
			tx=session.beginTransaction();
			Film addf = new Film();
			addf.setTitle(title);
			addf.setRelease_year(release_year);
			addf.setDescription(description);
			String hql= "from language where name:=name";
			Query query = session.createQuery(hql);
			query.setString("name", language);
			List <Language> lang = (List<Language>) query.list();
			addf.setLanguage_id(lang);
			addf.setDirector(director);
			addf.setSpecial_features(special_features);
			addf.setDescription(description);
			
			session.save(addf);
			System.out.println("Data added");
			tx.commit();
			return "success";
			
		}catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}

	@Override
	public HashMap<Object, Object> advanceSearch(Integer film_id, String title, String description, String release_year,
			String rating, String special_features, String language_id, String director) {
		// TODO Auto-generated method stub
		return null;
	}

}

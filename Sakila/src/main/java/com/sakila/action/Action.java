package com.sakila.action;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sakila.manager.Filmmanager;


public class Action {
	
	public Integer film_id;
	public String title;
	public String description;
	public String release_year;
	public String rating;
    public String special_features;
    public String language_id;
    public String director;
    
	public Integer getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSpecial_features() {
		return special_features;
	}
	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}
	public String getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
    
	private HashMap<Object,Object> response;
	public HashMap<Object, Object> getResponse() {
		return response;
	}
	public void setResponse(HashMap<Object, Object> response) {
		this.response = response;
	}
	
	public String dataLoading() {
		try {
			System.out.println("action file");
			
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Filmmanager filmManager = (Filmmanager) context.getBean("ManagerBean");
			
			HashMap<Object,Object> hm= filmManager.dataLoading(film_id, title,description,release_year,
					rating, special_features,language_id, director);
			System.out.println("action"+hm);
			setResponse(hm);
			System.out.println("success");
			return "success";
					
		}
		catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

}

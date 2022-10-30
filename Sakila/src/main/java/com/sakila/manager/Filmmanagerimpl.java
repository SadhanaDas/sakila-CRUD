package com.sakila.manager;

import java.util.HashMap;
import com.sakila.dao.*;

public class Filmmanagerimpl implements Filmmanager {
	
	private Filmdao film;
	
	public Filmdao getFilm() {
		return film;
	}
	
	public void setFilm(Filmdao film) {
		this.film = film;
	}
	
	public HashMap<Object, Object> dataLoading(Integer film_id, String title, String description, String release_year,
			String rating, String special_features, String language_id, String director) {
		System.out.println("manager impl");
		return film.dataLoading(film_id, title,description,release_year,
				rating, special_features,language_id, director);
	}

	@Override
	public String addRow(String title, String description, String release_year, String rating, String special_features,
			String language_id, String director) {
		System.out.println("manager impl addRow");
		return film.addRow(title,description,release_year,
				rating, special_features,language_id, director);
	}

	@Override
	public HashMap<Object, Object> advanceSearch(Integer film_id, String title, String description, String release_year,
			String rating, String special_features, String language_id, String director) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

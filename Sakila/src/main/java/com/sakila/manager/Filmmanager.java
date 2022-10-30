package com.sakila.manager;

import java.util.HashMap;

public interface Filmmanager {
	HashMap<Object,Object> dataLoading(Integer film_id, String title, String description, 
			String release_year,String rating,String special_features,String language_id,String director);
	public String addRow(String title, String description, String release_year,String rating,
			String special_features,String language_id,String director);
	HashMap<Object,Object> advanceSearch(Integer film_id, String title, String description, 
			String release_year,String rating,String special_features,String language_id,String director);
}

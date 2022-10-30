package com.sakila.dao;

import java.util.HashMap;

public interface Filmdao {
	HashMap<Object,Object> dataLoading(Integer film_id, String title, String description, 
			String release_year,String rating,String special_features,String language_id,String director);
	public String addRow(String title, String description, String release_year,String rating,
			String special_features,String language,String director);
	HashMap<Object,Object> advanceSearch(Integer film_id, String title, String description, 
			String release_year,String rating,String special_features,String language_id,String director);
}

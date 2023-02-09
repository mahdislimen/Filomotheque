package com.gestion.cinema.service;

import java.util.List;

import com.gestion.cinema.entities.Categorie;

public interface IServiceCategorie {
	
	public Categorie createCategorie(Categorie categorie);
	public Categorie findCategorieById(int id);
	public List<Categorie> findAllCategorie();
	public Categorie updateCategorie(Categorie categorie);
	public void deleteCategorie(int id);

}

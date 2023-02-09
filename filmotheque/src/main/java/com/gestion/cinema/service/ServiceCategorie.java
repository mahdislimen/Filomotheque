package com.gestion.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.cinema.entities.Categorie;
import com.gestion.cinema.repository.CategorieRepository;
@Service
public class ServiceCategorie implements IServiceCategorie{

	CategorieRepository categorieRepository;
	
	
	public ServiceCategorie(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}

	@Override
	public Categorie createCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public Categorie findCategorieById(int id) {
		return categorieRepository.findById(id).get();
	}

	@Override
	public List<Categorie> findAllCategorie() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie updateCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public void deleteCategorie(int id) {
		categorieRepository.deleteById(id);
	}

}

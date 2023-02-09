package com.gestion.cinema.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.cinema.entities.Acteur;
import com.gestion.cinema.entities.Film;
import com.gestion.cinema.repository.ActeurRepository;
@Service
public class ServiceActeur implements IServiceActeur { 
	
	//@Autowired
	ActeurRepository acteurRepository;
	
	public ServiceActeur(ActeurRepository acteurRepository) {
		this.acteurRepository = acteurRepository; 
	} 
	
	@Override
	public Acteur CreateActeur(Acteur acteur ) {
		return acteurRepository.save(acteur); 
	} 
	
	@Override
	public List<Acteur> getAllActeurs() {
		return acteurRepository.findAll();
	}

}

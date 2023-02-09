package com.gestion.cinema.service;

import java.util.List;

import com.gestion.cinema.entities.Acteur;
import com.gestion.cinema.entities.Film;

public interface IServiceActeur {    
	
	public Acteur CreateActeur(Acteur acteu); 
	public List<Acteur> getAllActeurs();  
	
  


}

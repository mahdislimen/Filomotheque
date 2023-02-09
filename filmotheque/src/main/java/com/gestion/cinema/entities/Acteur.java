package com.gestion.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;  
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 

public class Acteur { 
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	private String nom ; 
	private String prenom ; 
	@ManyToMany(mappedBy = "acteurs")  
	private List<Film> films ; 
}

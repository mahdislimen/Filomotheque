package com.gestion.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestion.cinema.entities.Film;
import com.gestion.cinema.service.IServiceCategorie;
import com.gestion.cinema.service.IServiceFilm;

@Controller
@RequestMapping("/film/")
public class FilmController {
	
	IServiceFilm iServiceFilm;

	public FilmController(IServiceFilm iServiceFilm) {
		this.iServiceFilm = iServiceFilm;
	}
	
	@Autowired
	IServiceCategorie iServiceCategorie;
	
	@GetMapping("all")
	public String getallfilms(Model model) {
		model.addAttribute("films", iServiceFilm.getAllFilm());
		return "affiche";
	}
	
	@GetMapping("new")
	public String afficheNewForm(Model model) {
		model.addAttribute("categories", iServiceCategorie.findAllCategorie());
		return "ajout";
	}
	
	@PostMapping("add")
	public String add(Film film) {
		iServiceFilm.createFilm(film);
		return "redirect:/film/all";
	}
}

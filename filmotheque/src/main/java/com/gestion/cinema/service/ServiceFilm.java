package com.gestion.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.cinema.entities.Film;
import com.gestion.cinema.repository.FilmRepository;

@Service
public class ServiceFilm implements IServiceFilm {
	
	//@Autowired
	FilmRepository filmRepository;
	
	public ServiceFilm(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}

	@Override
	public Film createFilm(Film film) {
		return filmRepository.save(film);
	}

	@Override
	public Film findFilmById(int id) {
		return filmRepository.findById(id).get();
	}

	@Override
	public List<Film> getAllFilm() {
		return filmRepository.findAll();
	}

	@Override
	public Film updateFilm(Film film) {
		return filmRepository.save(film);
	}

	@Override
	public void deleteFilm(int id) {
		filmRepository.deleteById(id);	
	}

	
}

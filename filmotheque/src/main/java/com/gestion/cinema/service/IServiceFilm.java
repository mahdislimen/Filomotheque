package com.gestion.cinema.service;

import java.util.List;

import com.gestion.cinema.entities.Film;

public interface IServiceFilm {

	public Film createFilm(Film film);
	public Film findFilmById(int id);
	public List<Film> getAllFilm();
	public Film updateFilm(Film film);
	public void deleteFilm(int id);
}

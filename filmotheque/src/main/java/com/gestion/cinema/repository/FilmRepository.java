package com.gestion.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.cinema.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}

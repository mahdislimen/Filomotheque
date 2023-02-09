package com.gestion.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.cinema.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}

package com.gestion.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.cinema.entities.Acteur;

public interface ActeurRepository extends JpaRepository<Acteur, Integer> {

}

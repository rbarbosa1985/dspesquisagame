package com.devsuperior.dspesquisagame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisagame.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}

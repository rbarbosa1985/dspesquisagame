package com.devsuperior.dspesquisagame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisagame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

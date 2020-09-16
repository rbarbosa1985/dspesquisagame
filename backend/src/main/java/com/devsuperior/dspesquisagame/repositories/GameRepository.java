package com.devsuperior.dspesquisagame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisagame.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}

package com.devsuperior.dspesquisagame.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.dspesquisagame.dto.GameDTO;
import com.devsuperior.dspesquisagame.entities.Game;
import com.devsuperior.dspesquisagame.repositories.GameRepository;

public class GameService {
	@Autowired
	private GameRepository repository;
	
	public List<GameDTO> findAll(){
		List<Game>list = repository.findAll();
		return list.stream().map(x -> new GameDTO(X)).collect(Collectors.toList());
	}
}

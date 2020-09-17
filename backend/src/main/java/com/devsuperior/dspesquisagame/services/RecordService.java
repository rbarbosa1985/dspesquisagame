package com.devsuperior.dspesquisagame.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisagame.dto.RecordDTO;
import com.devsuperior.dspesquisagame.dto.RecordInsertDTO;
import com.devsuperior.dspesquisagame.entities.Game;
import com.devsuperior.dspesquisagame.entities.Record;
import com.devsuperior.dspesquisagame.repositories.GameRepository;
import com.devsuperior.dspesquisagame.repositories.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		//Pegando o game para salvar o Record.
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		
		return new RecordDTO(entity);
	}

	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
	
	/*
	@Transactional(readOnly = true)
	public List<RecordDTO> findAll(){
		List<Record>list = repository.findAll();
		return list.stream().map(x -> new RecordDTO(x)).collect(Collectors.toList());
	}*/
}

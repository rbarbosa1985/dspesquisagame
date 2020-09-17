package com.devsuperior.dspesquisagame.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisagame.entities.Game;
import com.devsuperior.dspesquisagame.entities.enums.Platform;

public class GameDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String tittle;
	private Platform platform;
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		id = entity.getId();
		tittle = entity.getTitle();
		platform = entity.getPlatform();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
}

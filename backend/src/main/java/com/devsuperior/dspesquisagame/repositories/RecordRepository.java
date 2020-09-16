package com.devsuperior.dspesquisagame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisagame.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}

package com.code.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.code.entity.TechnicalEntity;


@org.springframework.stereotype.Repository
public interface TechnicalRepository extends CrudRepository<TechnicalEntity, Integer>{
	
	
	List<TechnicalEntity>findAll();

	List<TechnicalEntity>findByIdentifyTechnicalAndNumberWeekOrderByEndDate(String identifyTechnical, String numberWeek);

}

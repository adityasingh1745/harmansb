package com.harman.assignment2.repository;

import org.springframework.data.repository.CrudRepository;
import com.harman.assignment2.model.AllData;

public interface DataRepository extends CrudRepository<AllData, Integer>{
	
}

package com.harman.assignment2.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.harman.assignment2.model.AllData;
import com.harman.assignment2.repository.DataRepository;

@Service
public class DataService {
	@Autowired
	DataRepository dataRepository;
	
	// getting all the data
	public List<AllData> getAllData(){
		List<AllData> data = new ArrayList<>();
		dataRepository.findAll().forEach(data1 -> data.add(data1));
		return data;
	}
	
	// get a specific data
	public AllData getDataById(int id) {
		return dataRepository.findById(id).get();
	}
	
	// saving a specific record
	public void saveOrUpdate(AllData alldata){
		dataRepository.save(alldata);
	}
	
	//delete a specific record
	public void delete(int id) {
		dataRepository.deleteById(id);
	}
	
	//update a record
	public void update(AllData data, int id) {
		dataRepository.save(data);
	}	
}

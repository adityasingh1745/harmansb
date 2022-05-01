package com.harman.assignment2.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.harman.assignment2.model.AllData;
import com.harman.assignment2.service.DataService;

@RestController
public class DataController {
	@Autowired
	DataService dataService;
	
	// for all the data
	@GetMapping("/alldata")
	private List<AllData> getAllData(){
		return dataService.getAllData();
	}
	
	// for retrieving a specific data
	@GetMapping("/alldata/{id}")
	private AllData getData(@PathVariable("id") int id) {
		return dataService.getDataById(id);
	}
	
	// for deleting a specific data
	@DeleteMapping("/alldata/{id}")
	private void deleteData(@PathVariable("id") int id) {
		dataService.delete(id);
	}
	
	// for saving the data
	@PostMapping("/alldata")
	private int saveData(@RequestBody AllData alldata) {
		dataService.saveOrUpdate(alldata);
		return alldata.getId();
	}
	
	//for updating the data
	@PutMapping("/alldata")
	private AllData update(@RequestBody AllData data) {
		dataService.saveOrUpdate(data);
		return data;
	}
}

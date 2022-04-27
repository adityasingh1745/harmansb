package com.harman.controller;
import java.util.*;
import com.harman.model.Topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
//	@RequestMapping("/topics")
//	public String getAllTopics() {
//		return "All the topics";
//	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return allTopics();
	}
	
	List<Topic> allTopics(){
		return Arrays.asList(
				new Topic("spring", "spring framework", "description about spring framework"),
				new Topic("java","java framework","description about java framework"),
				new Topic("javascript","javascript framework","description about javascript framework")
				);
	}
}

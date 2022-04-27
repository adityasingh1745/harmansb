package com.harman.db;

import org.springframework.data.repository.CrudRepository;

import com.harman.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(String id)
	//deleteTopic(String id)

}

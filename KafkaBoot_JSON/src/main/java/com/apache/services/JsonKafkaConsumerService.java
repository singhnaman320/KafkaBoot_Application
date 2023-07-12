package com.apache.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.apache.model.User;

@Service
public class JsonKafkaConsumerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerService.class);
	
	@KafkaListener(topics = "springTopic", groupId = "groupone")
	public void consume(User user) {
		
	}
}

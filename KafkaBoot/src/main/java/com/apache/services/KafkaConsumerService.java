package com.apache.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);
	
	@KafkaListener(topics = "springTopic", groupId = "groupone")
	public void consume(String message) { // consume method will listen to springTopic
		
		LOGGER.info(String.format("Message suscribed %s", message));
	}
}

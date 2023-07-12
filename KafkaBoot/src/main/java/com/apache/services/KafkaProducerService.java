package com.apache.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	// Log message
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);

	private KafkaTemplate<String, String> kafkaTemplate;
	
	// We'll use constructor instructor
	public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplate.send("springTopic", message);
	}
}

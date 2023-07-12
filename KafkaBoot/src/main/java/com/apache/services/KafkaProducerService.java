package com.apache.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	private KafkaTemplate<String, String> kafkaTemplate;
	
	// We'll use constructor instructor
	public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		
		kafkaTemplate.send("springTopic", message);
	}
}

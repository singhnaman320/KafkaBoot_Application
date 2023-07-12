package com.apache.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "springTopic")
	public void consume(String message) { // consume method will listen to springTopic
		
	}
}

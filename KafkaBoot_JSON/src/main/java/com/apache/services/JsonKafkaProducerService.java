package com.apache.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.apache.model.User;

@Service
public class JsonKafkaProducerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerService.class);
	
	private KafkaTemplate<String, User> kafkaTemplate;

	public JsonKafkaProducerService(KafkaTemplate<String, User> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(User user) {
		
		Message<User> message = MessageBuilder
								.withPayload(user)
								.setHeader(KafkaHeaders.TOPIC, "springTopic")
								.build();
		
		kafkaTemplate.send(message);
	}
}

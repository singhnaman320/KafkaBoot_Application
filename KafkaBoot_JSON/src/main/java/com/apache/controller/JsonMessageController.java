package com.apache.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apache.model.User;
import com.apache.services.JsonKafkaProducerService;

@RestController
@RequestMapping("/api/json/kafka")
public class JsonMessageController {

	private JsonKafkaProducerService jsonKafkaProducerService;

	// We will use constructor based dependency injection
	public JsonMessageController(JsonKafkaProducerService jsonKafkaProducerService) {
		super();
		this.jsonKafkaProducerService = jsonKafkaProducerService;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publishMessage( @RequestBody User user){
		
	}
}

package com.apache.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apache.services.JsonKafkaProducerService;

@RestController
@RequestMapping("/api/json/kafka")
public class JsonMessageController {

	private JsonKafkaProducerService jsonKafkaProducerService;

	public JsonMessageController(JsonKafkaProducerService jsonKafkaProducerService) {
		super();
		this.jsonKafkaProducerService = jsonKafkaProducerService;
	}
	
	
}

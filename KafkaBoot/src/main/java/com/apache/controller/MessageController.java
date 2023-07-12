package com.apache.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apache.services.KafkaProducerService;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {

	private KafkaProducerService kafkaProducerService;

	// Here only one constructor so we can ignore @Autowired
	public MessageController(KafkaProducerService kafkaProducerService) {
		super();
		this.kafkaProducerService = kafkaProducerService;
	}
	
	//http://localhost:8088/api/kafka/publish?message=first Message 
	@PostMapping("/publish")
	public ResponseEntity<String> publishMessage(@RequestParam("message") String message){
		
		kafkaProducerService.sendMessage(message);
		
		return ResponseEntity.ok("Message Published.!");
	}
	
}

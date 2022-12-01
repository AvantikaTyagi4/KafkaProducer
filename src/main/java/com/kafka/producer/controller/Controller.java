package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping(value="/sendMessage")
	public String sendMassage(@RequestParam ("message") String message) {
		return kafkaProducer.sendMessage(message);
	}
}

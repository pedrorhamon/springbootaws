package com.starking.aws_project01.controllers;

import org.slf4j.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/dog/{name}")
	public ResponseEntity<?> dogTests(@PathVariable String name) {		
		LOG.info("Test controller - name : {}" , name);
		return ResponseEntity.ok("Name : " + name);
	}
}
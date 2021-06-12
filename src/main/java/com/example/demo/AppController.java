package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/App")
@RestController
public class AppController {

	
	
	@GetMapping("/getApp")
	ResponseEntity m1() {
		
		return new ResponseEntity("Hello World", null, 200);
		
	}
}

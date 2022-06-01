package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dao.InstaRepository;
import com.backend.entity.Login;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ControllerClass {
	
	
	@Autowired
	private InstaRepository instaRepository;
	
	
	@GetMapping("/hello")
	public String onetwoth() {
		return "hello world";
	}
	
@PostMapping("/request")
public String save(@RequestBody Login login) {
	
	instaRepository.save(login);
	return "login successfully";
	
}



}

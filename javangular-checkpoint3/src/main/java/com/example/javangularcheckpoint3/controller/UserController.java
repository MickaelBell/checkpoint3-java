package com.example.javangularcheckpoint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javangularcheckpoint3.entity.User;
import com.example.javangularcheckpoint3.service.Cp3Service;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
	
	@Autowired
	Cp3Service cp3serv;
	
	@GetMapping("/users")
	public List<User> indexTrain(){
		return cp3serv.getAllUsers();
	}

}

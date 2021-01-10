package com.checkpoint3.cp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.checkpoint3.cp3.entity.User;
import com.checkpoint3.cp3.service.Cp3Service;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
	
	@Autowired
	Cp3Service cp3serv;
	
	@GetMapping("/users")
	public List<User> indexUser(){
		return cp3serv.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> showDetails(@PathVariable Long id){
		User user = cp3serv.getUserById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User userToUpdate = cp3serv.updateUsers(user);
		return ResponseEntity.ok().body(userToUpdate);
	}

	
	@DeleteMapping("/users/{id}")
	public boolean delete(@PathVariable Long id) {
		return cp3serv.deleteUsers(id);
	}
}
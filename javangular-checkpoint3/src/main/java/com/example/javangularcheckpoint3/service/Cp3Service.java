package com.example.javangularcheckpoint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javangularcheckpoint3.entity.User;
import com.example.javangularcheckpoint3.repository.UserRepository;


@Service
public class Cp3Service {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public User getUserById(Long id) {
		return userRepo.findById(id).get();
	}
}

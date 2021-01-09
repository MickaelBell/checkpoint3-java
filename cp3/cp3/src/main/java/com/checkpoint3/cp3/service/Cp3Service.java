package com.checkpoint3.cp3.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.checkpoint3.cp3.entity.Post;
import com.checkpoint3.cp3.entity.User;
import com.checkpoint3.cp3.reposirory.PostRepository;
import com.checkpoint3.cp3.reposirory.UserRepository;




@Service
public class Cp3Service {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	PostRepository postRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public User getUserById(Long id) {
		return userRepo.findById(id).get();
	}
	
	public User updateUsers(@RequestBody User user) {
		return userRepo.save(user);
	}
	
    public boolean deleteUsers(Long id) {
        userRepo.deleteById(id);
        return true;
    }
	
	public List<Post> getAllPosts() {
		return postRepo.findAll();
	}
}

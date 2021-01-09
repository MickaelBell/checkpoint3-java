package com.checkpoint3.cp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.checkpoint3.cp3.entity.Post;
import com.checkpoint3.cp3.service.Cp3Service;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class PostController {

	@Autowired
	Cp3Service cp3serv;
	
	@GetMapping("/posts")
	public List<Post> indexPost(){
		return cp3serv.getAllPosts();
	}
}


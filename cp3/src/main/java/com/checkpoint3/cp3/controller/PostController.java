package com.checkpoint3.cp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/posts/{id}")
	public ResponseEntity<Post> showPosts(@PathVariable Long id){
		Post post = cp3serv.getPostById(id);
		return ResponseEntity.ok().body(post);
	}
	
	@PostMapping("/posts")
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		Post postToCreate = cp3serv.createPost(post);
		return ResponseEntity.ok().body(postToCreate);
	}
	
	@PutMapping("/posts/{id}")
	public ResponseEntity<Post> updatePost(@RequestBody Post post) {
		Post postToUpdate = cp3serv.updatePost(post);
		return ResponseEntity.ok().body(postToUpdate);
	}

	
	@DeleteMapping("/posts/{id}")
	public boolean delete(@PathVariable Long id) {
		return cp3serv.deletePost(id);
	}
	
}


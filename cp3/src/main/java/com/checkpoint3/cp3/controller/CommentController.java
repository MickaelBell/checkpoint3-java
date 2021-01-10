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

import com.checkpoint3.cp3.entity.Comment;
import com.checkpoint3.cp3.service.Cp3Service;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CommentController {

	
	@Autowired
	Cp3Service cp3serv;
	
	@GetMapping("/comments")
	public List<Comment> indexPost(){
		return cp3serv.getAllComments();
	}
	
	@GetMapping("/comments/{id}")
	public ResponseEntity<Comment> showComment(@PathVariable Long id){
		Comment comment = cp3serv.getCommentById(id);
		return ResponseEntity.ok().body(comment);
	}
	
	@PostMapping("/comments/{id}")
	public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
		Comment commentToCreate = cp3serv.createComment(comment);
		return ResponseEntity.ok().body(commentToCreate);
	}
	
	@PutMapping("/comments/{id}")
	public ResponseEntity<Comment> updateComment(@RequestBody Comment comment) {
		Comment commentToUpdate = cp3serv.updateComment(comment);
		return ResponseEntity.ok().body(commentToUpdate);
	}
	
	@DeleteMapping("/comments/{id}")
	public boolean delete(@PathVariable Long id) {
		return cp3serv.deleteComment(id);
	}
	
}

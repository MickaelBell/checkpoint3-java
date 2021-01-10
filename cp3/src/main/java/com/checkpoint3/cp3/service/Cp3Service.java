package com.checkpoint3.cp3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.checkpoint3.cp3.entity.Comment;
import com.checkpoint3.cp3.entity.Post;
import com.checkpoint3.cp3.entity.User;
import com.checkpoint3.cp3.reposirory.CommentRepository;
import com.checkpoint3.cp3.reposirory.PostRepository;
import com.checkpoint3.cp3.reposirory.UserRepository;




@Service
public class Cp3Service {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	CommentRepository commentRepo;
	
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
	
	public Post getPostById(Long id) {
		return postRepo.findById(id).get();
	}
	
	public Post createPost(@RequestBody Post post) {
		Post newPost = new Post();
		return postRepo.save(newPost);
	}
	
	public Post updatePost(@RequestBody Post post) {
		return postRepo.save(post);
	}
	
    public boolean deletePost(Long id) {
        postRepo.deleteById(id);
        return true;
    }
    
    public List<Comment> getAllComments() {
        return commentRepo.findAll();
    }
    
    public Comment getCommentById(Long id) {
        return commentRepo.findById(id).get();
    }
    
	public Comment createComment(@RequestBody Comment comment) {
		Comment newComment = new Comment();
		return commentRepo.save(newComment);
	}
	
	public Comment updateComment(@RequestBody Comment comment) {
		return commentRepo.save(comment);
	}
	
    public boolean deleteComment(Long id) {
        postRepo.deleteById(id);
        return true;
    }
    
}

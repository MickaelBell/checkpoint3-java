package com.checkpoint3.cp3.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.checkpoint3.cp3.entity.Post;



public interface PostRepository extends JpaRepository<Post, Long>{

}

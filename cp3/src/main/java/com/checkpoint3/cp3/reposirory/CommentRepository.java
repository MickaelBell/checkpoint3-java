package com.checkpoint3.cp3.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.checkpoint3.cp3.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}

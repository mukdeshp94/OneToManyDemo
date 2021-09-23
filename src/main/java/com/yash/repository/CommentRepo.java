package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {

}

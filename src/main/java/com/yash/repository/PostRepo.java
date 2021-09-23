package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.entity.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

}

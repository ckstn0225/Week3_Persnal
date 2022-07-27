package com.sparta.java3w.Repository;

import com.sparta.java3w.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
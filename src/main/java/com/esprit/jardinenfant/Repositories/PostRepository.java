package com.esprit.jardinenfant.Repositories;

import com.esprit.jardinenfant.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}



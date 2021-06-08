package com.esprit.jardinenfant.Repositories;

import com.esprit.jardinenfant.Entities.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository extends JpaRepository<PostComment, Integer> {
}

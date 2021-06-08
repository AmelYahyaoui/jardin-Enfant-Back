package com.esprit.jardinenfant.Repositories;

import com.esprit.jardinenfant.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}

package com.esprit.jardinenfant.Services;

import com.esprit.jardinenfant.Entities.Feedback;
import com.esprit.jardinenfant.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Autowired
    FeedbackRepository feedbackRepository;

    @Override
    public Feedback save(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}

package com.esprit.jardinenfant.Controllers;


import com.esprit.jardinenfant.Entities.Feedback;
import com.esprit.jardinenfant.Entities.Notification;
import com.esprit.jardinenfant.Services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addFeed", method = RequestMethod.POST)
    public Feedback saveFeedback(@RequestBody Feedback feedback) throws SQLIntegrityConstraintViolationException {
//        System.out.println(feedback);
        return feedbackService.save(feedback);
    }

}

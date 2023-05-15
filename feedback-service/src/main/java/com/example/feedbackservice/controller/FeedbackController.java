package com.example.feedbackservice.controller;

import com.example.feedbackservice.model.Feedback;
import com.example.feedbackservice.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackService service;

    @PostMapping("/addFeedback")
    public Feedback addFeedback(@RequestBody Feedback feedback){
        return service.saveFeedback(feedback);
    }
    @PostMapping("/addFeedbacks")
    public List<Feedback> addFeedbacks(@RequestBody List<Feedback> feedbacks){
        return service.saveFeedbacks(feedbacks);
    }
    @GetMapping("/feedbacks")
    public List<Feedback> findAllFeedbacks(){
        return service.getFeedbacks();
    }
    @DeleteMapping("/delete/{order_id}")
    public String deleteFeedback(int order_id){
        return service.deleteFeedback(order_id);
    }

}

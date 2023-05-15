package com.example.feedbackservice.service;

import com.example.feedbackservice.model.Feedback;
import com.example.feedbackservice.repository.IFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private IFeedbackRepository repository;

    public Feedback saveFeedback(Feedback feedback){    //post method
        return repository.save(feedback);
    }
    public List<Feedback> saveFeedbacks(List<Feedback> feedbacks){    //post method for list of feedbacks
        return repository.saveAll(feedbacks);
    }
    public List<Feedback> getFeedbacks(){  //get method for list of feedbacks
        return repository.findAll();
    }

    public String deleteFeedback(int order_id){  //delete method for feedback
        repository.deleteById(order_id);
        return "Feedback Removed !!"+order_id;
    }
}

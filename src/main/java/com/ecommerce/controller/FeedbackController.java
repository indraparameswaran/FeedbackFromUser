package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.model.Feedback;
import com.ecommerce.repository.FeedbackRepository;

@RestController
@RequestMapping("feedback")
public class FeedbackController {


    @Autowired
    private FeedbackRepository repo;


    @GetMapping("/")
    public String showServiceName()
    {
        return "Feedback";
    }

    @GetMapping("/feedback/{id}")
    public Feedback showFeedbackById(@PathVariable Integer id)
    {
        // TODO: Add error handling

        return repo.findById(id).get();

    }


    @PostMapping("/submitfeedback")                      
    public String addFeedback(Feedback newFeedback) {

        //TODO: Add error handling
    	
        return "Feedback Saved to DB"+ repo.save(newFeedback);
        		

    }


}
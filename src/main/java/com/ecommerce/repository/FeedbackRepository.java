package com.ecommerce.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Feedback;
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
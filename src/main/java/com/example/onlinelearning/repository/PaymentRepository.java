package com.example.onlinelearning.repository;

import com.example.onlinelearning.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}

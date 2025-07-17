package com.example.onlinelearning.service;

import com.example.onlinelearning.model.Payment;
import com.example.onlinelearning.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}

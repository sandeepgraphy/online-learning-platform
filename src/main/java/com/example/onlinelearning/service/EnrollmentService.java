package com.example.onlinelearning.service;

import com.example.onlinelearning.model.Enrollment;
import com.example.onlinelearning.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollUser (Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
}

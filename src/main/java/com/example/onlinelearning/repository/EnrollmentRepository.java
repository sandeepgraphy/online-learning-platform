package com.example.onlinelearning.repository;

import com.example.onlinelearning.model.Enrollment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnrollmentRepository extends MongoRepository<Enrollment, String> {
}

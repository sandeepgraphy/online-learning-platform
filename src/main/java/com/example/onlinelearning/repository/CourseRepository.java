package com.example.onlinelearning.repository;

import com.example.onlinelearning.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
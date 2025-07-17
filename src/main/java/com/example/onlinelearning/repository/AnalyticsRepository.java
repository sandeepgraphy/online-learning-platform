package com.example.onlinelearning.repository;

import com.example.onlinelearning.model.Analytics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnalyticsRepository extends MongoRepository<Analytics, String> {
}

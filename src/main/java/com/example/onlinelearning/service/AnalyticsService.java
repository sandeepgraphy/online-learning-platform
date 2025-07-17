package com.example.onlinelearning.service;

import com.example.onlinelearning.model.Analytics;
import com.example.onlinelearning.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {
    @Autowired
    private AnalyticsRepository analyticsRepository;

    public Analytics logView(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }
}

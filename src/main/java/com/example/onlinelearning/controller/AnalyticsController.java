package com.example.onlinelearning.controller;

import com.example.onlinelearning.model.Analytics;
import com.example.onlinelearning.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    @Autowired
    private AnalyticsService analyticsService;

    @PostMapping
    public ResponseEntity<Analytics> logView(@RequestBody Analytics analytics) {
        return ResponseEntity.ok(analyticsService.logView(analytics));
    }
}

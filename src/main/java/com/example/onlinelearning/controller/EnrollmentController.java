package com.example.onlinelearning.controller;

import com.example.onlinelearning.model.Enrollment;
import com.example.onlinelearning.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public ResponseEntity<Enrollment> enrollUser (@RequestBody Enrollment enrollment) {
        return ResponseEntity.ok(enrollmentService.enrollUser (enrollment));
    }
}

package com.example.onlinelearning.controller;

import com.example.onlinelearning.model.User;
import com.example.onlinelearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser (@RequestBody User user) {
        User registeredUser  = userService.registerUser (user);
        return ResponseEntity.ok(registeredUser );
    }
}

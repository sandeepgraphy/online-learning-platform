package com.example.onlinelearning.repository;


import com.example.onlinelearning.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
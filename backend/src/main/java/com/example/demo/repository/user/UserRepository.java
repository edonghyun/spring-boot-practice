package com.example.demo.repository.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.user.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}


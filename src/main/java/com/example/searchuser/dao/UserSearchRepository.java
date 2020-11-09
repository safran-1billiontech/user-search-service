package com.example.searchuser.dao;

import com.example.searchuser.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserSearchRepository extends MongoRepository<User,Integer> {
}

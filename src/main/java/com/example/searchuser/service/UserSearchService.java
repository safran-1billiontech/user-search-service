package com.example.searchuser.service;

import com.example.searchuser.model.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface UserSearchService {

    public List<User> getAllUser();

    public Optional<User> getUser(@PathVariable int id);

}

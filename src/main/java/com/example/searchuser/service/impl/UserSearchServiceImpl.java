package com.example.searchuser.service.impl;

import com.example.searchuser.dao.UserSearchRepository;
import com.example.searchuser.model.User;
import com.example.searchuser.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserSearchServiceImpl implements UserSearchService {

    @Autowired
    UserSearchRepository userSearchRepository;

    @Override
    public List<User> getAllUser() {
        return userSearchRepository.findAll();
    }

    @Override
    public Optional<User> getUser(int id) {
        return userSearchRepository.findById(id);
    }
}

package com.example.searchuser.controller;

import com.example.searchuser.model.User;
import com.example.searchuser.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserSearchController {

    @Autowired
    UserSearchService userSearchService;

    @GetMapping("/findAllUser")
    public List<User> getUser() {
        return userSearchService.getAllUser();
    }

    @GetMapping("/findAllUser/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userSearchService.getUser(id);
    }



}

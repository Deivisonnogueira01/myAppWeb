package com.web.frame.project_web.services;

import java.util.List;

import com.web.frame.project_web.model.User;
import com.web.frame.project_web.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
         return this.userRepository.findAll();
    }
}

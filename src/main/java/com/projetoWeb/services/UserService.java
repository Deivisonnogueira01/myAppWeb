package com.projetoWeb.services;

import java.util.List;

import com.projetoWeb.model.User;
import com.projetoWeb.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {


        return this.userRepository.findAll();
    };

    
}

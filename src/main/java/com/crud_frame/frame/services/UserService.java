package com.crud_frame.frame.services;


import java.util.List;

import com.crud_frame.frame.model.User;
//import com.crud_frame.frame.repositories.UserRepository;
import com.crud_frame.frame.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {

        return this.userRepository.findAll();
    };

    public void SalvarUser(User user){
      this.userRepository.save(user);
    } 


    
}

//Fontes
//thymeleaf value=
//boostrap para formulario
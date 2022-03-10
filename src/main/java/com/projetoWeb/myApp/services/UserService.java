package com.projetoWeb.myApp.services;

import java.util.List;

import com.projetoWeb.myApp.model.User;
import com.projetoWeb.myApp.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {

        return this.userRepository.findAll();
    };

    //public String products(User user){
      //  return this.userRepository.save();
    //} 


    
}

//Fontes
//thymeleaf value=
//boostrap para formulario

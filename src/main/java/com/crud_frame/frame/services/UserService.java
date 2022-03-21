package com.crud_frame.frame.services;


import java.util.List;
import java.util.UUID;
import com.crud_frame.frame.model.User;

import com.crud_frame.frame.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {

        return this.userRepository.findAll();
    }

    public void SalvarUser(User user){
      this.userRepository.save(user);
    } 


    public void DeletarUser(UUID id){
      this.userRepository.deleteById(id);
    }

    public void get(UUID id) {
        this.userRepository.findById(id);
    }
}

//Fontes
//thymeleaf value=
//boostrap para formulario
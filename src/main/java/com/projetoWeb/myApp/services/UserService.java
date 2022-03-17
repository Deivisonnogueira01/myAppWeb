package com.projetoWeb.myApp.services;

import java.util.List;
import java.util.UUID;

import com.projetoWeb.myApp.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private com.projetoWeb.myApp.repositories.UserRepository userRepository;

    public List<User> getUser() {

        return this.userRepository.findAll();
    };

    public void SalvarUser(User user){
      this.userRepository.save(user);
    } 


   public void DeletarUser( UUID id){
     this.userRepository.deleteById(id);
   }
    
}
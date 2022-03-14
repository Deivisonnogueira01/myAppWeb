package com.crud_frame.frame.controller;

import java.util.List;

import com.crud_frame.frame.model.User;
import com.crud_frame.frame.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;
    
    @GetMapping("/listar")
    public String getUser() {
        return "usuario Localizado";
     
    }

    @GetMapping("/listarTodos")
    public ModelAndView listarTodos() {
        ModelAndView mv = new ModelAndView("listarTodos");

        List<User> users = this.service.getUser();
         mv.addObject("usersList", users);
         return mv;

    }

    
}
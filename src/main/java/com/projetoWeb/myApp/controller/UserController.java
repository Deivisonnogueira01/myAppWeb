package com.projetoWeb.myApp.controller;

import java.util.List;

import com.projetoWeb.myApp.model.User;
import com.projetoWeb.myApp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/listar")
    public String getUser() {
        return "usuario Localizado";
     
    }

    @GetMapping("/listarTodos")
    public ModelAndView listarTodos() {
        ModelAndView mv = new ModelAndView("listarTodos");

        List<User> users = this.userService.getUser();
         mv.addObject("usersList", users);
         return mv;

    }

}

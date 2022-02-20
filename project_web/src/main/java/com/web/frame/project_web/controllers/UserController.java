package com.web.frame.project_web.controllers;

import java.util.List;

import com.web.frame.project_web.model.User;
import com.web.frame.project_web.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
@Autowired
private UserService userService;
 

  @GetMapping("/listar")       
  public  String getUser() { 
      return "user";
  
  }    

  @GetMapping("/listarTodos")
  public ModelAndView listarTodos(){
      ModelAndView mv = new ModelAndView("listarTodos");
      List<User> users = this.userService.getUsers();
      mv.addObject("userList", users);
      return mv;
  }
    
    
}

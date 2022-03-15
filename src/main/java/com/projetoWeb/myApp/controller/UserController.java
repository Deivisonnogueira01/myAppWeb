package com.projetoWeb.myApp.controller;

import java.util.List;

import javax.validation.Valid;

import com.projetoWeb.myApp.model.User;
import com.projetoWeb.myApp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/newUser")
    public ModelAndView newUser() {
        ModelAndView mv = new ModelAndView("formularioUser");
        User user = new User();
        mv.addObject("userObj", user);
        return mv;

    }

    @PostMapping("/saveUser")
    public ModelAndView salvarUsuario(@ModelAttribute @Valid User user, BindingResult result,
            RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return new ModelAndView("redirect erro");
        }
        service.SalvarUser(user);
        return new ModelAndView("redirect:/users/listarTodos");

    }

}
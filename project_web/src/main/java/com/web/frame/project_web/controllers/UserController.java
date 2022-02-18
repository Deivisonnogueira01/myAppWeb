package com.web.frame.project_web.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    

    @GetMapping(value= "/userteste")
    public ResponseEntity<Response> addEntity(){
       return new ResponseEntity<>(HttpStatus.OK);
    }
               
    
    
}

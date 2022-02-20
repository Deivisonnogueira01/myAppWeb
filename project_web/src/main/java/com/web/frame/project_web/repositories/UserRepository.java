package com.web.frame.project_web.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.web.frame.project_web.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public List<User> findAll(){

    final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    List<User> users = new ArrayList<User>();
    users.add(new User(UUID.randomUUID(),"Douglas", "Dg@"));
    users.add(new User(UUID.randomUUID(),"Douglas", "Dg@"));
    users.add(new User(UUID.randomUUID(),"Douglas", "Dg@"));
    users.add(new User(UUID.randomUUID(),"Douglas", "Dg@"));
    logger.info("Listando os usuarios");

      return users;
    }
      
}

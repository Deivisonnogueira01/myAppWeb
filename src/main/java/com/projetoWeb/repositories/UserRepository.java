package com.projetoWeb.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.projetoWeb.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
  public List<User> findAll(){

    final Logger logger = LoggerFactory.getLogger(UserRepository.class);
      
    List<User> users = new ArrayList<User>();
    users.add(new User (UUID.randomUUID(), "deivison", "deivison@"));
    users.add(new User (UUID.randomUUID(), "douglas", "douglas@"));
    users.add(new User (UUID.randomUUID(), "geo", "deivison@"));
    users.add(new User (UUID.randomUUID(), "shortinho", "dudu@"));

    logger.info("listando os usuarios...");

    return users;
  }

}

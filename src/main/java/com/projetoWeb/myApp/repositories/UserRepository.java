package com.projetoWeb.myApp.repositories;

import java.util.UUID;

import com.projetoWeb.myApp.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{


  /*  
  public List<User> findAll(){

    final Logger logger = LoggerFactory.getLogger(UserRepository.class);
      
    List<User> users = new ArrayList<User>();
    users.add(new User (UUID.randomUUID(), "Deivison", "deivison@nogueira"));
    users.add(new User (UUID.randomUUID(), "Douglas", "douglas@santos"));
    users.add(new User (UUID.randomUUID(), "Geo", "geo@email"));
    users.add(new User (UUID.randomUUID(), "Shortinho", "dudu@email"));

    logger.info("listando os usuarios...");

    return users;
    */
  }



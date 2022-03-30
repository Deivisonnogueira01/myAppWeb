package com.crud_frame.frame.repositories;

import java.util.UUID;

import com.crud_frame.frame.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    

}

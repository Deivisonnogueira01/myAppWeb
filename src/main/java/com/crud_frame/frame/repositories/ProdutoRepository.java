package com.crud_frame.frame.repositories;

import java.util.UUID;

import com.crud_frame.frame.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID>{

    
}

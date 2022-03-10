package com.projetoWeb.myApp.repositories;

import java.util.UUID;

import com.projetoWeb.myApp.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

    
    
}

package com.crud_frame.frame.services;
import java.util.List;

import com.crud_frame.frame.model.Produto;
import com.crud_frame.frame.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
   @Autowired
   ProdutoRepository repository;


   public List<Produto> getProduto(){
       return  this.repository.findAll();
   }

   public void Salvar(Produto produto){
       this.repository.save(produto);
   }
}
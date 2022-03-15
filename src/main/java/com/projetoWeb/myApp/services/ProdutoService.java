package com.projetoWeb.myApp.services;

import java.util.List;

import com.projetoWeb.myApp.model.Produto;
import com.projetoWeb.myApp.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
   @Autowired
   ProdutoRepository repository;

   public List<Produto> GetProduto(){
       return  this.repository.findAll();
   };

   public void Salvar(Produto produto){
       this.repository.save(produto);
   }
}

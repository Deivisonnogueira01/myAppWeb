package com.projetoWeb.myApp.controller;

import java.util.List;

import javax.validation.Valid;

import com.projetoWeb.myApp.model.Produto;
import com.projetoWeb.myApp.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
   ProdutoService service;

   @GetMapping
   public String getProduto() {
    return "achamos o Produto";
 
}

@GetMapping("/listarTodosProdutos")
public ModelAndView listarTodos() {
    ModelAndView mv = new ModelAndView("listarTodos");

    List<Produto> produtos = this.service.GetProduto();
     mv.addObject("ProductList", produtos);
     return mv;

}
/*
@PostMapping("/save")
public ModelAndView(@Valid Produto) (){
      if(resu)

}
*/
}

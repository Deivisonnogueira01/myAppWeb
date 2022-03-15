package com.projetoWeb.myApp.controller;

import java.util.List;

import javax.validation.Valid;

import com.projetoWeb.myApp.model.Produto;
import com.projetoWeb.myApp.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public ModelAndView listarTodosProdutos() {
        ModelAndView mv = new ModelAndView("listarProdutos");

        List<Produto> produtos = this.service.GetProduto();
        mv.addObject("ProductList", produtos);
        return mv;

    }

    @PostMapping("/save")
    public ModelAndView salvarProduto(@Valid Produto produto, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return new ModelAndView("redirect erro");
        }
        service.Salvar(produto);
        return new ModelAndView("Redirect:ok");
    }

}
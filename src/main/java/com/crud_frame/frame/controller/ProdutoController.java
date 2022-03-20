package com.crud_frame.frame.controller;

import java.util.List;

import javax.validation.Valid;

import com.crud_frame.frame.model.Produto;
import com.crud_frame.frame.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired 
    private ProdutoService service;

    @GetMapping("/teste")
    public String getProduto() {
        return "achamos o Produto";

    } 

    @GetMapping("/newProdutos")
    public ModelAndView newProdutos() {
        ModelAndView mv = new ModelAndView("formularioProdutos");
        Produto produto = new Produto();
        mv.addObject("prodObj", produto);
        return mv;
    }
 
    @GetMapping("/listarTodosProdutos")
    public ModelAndView listarTodosProdutos() {
        ModelAndView mv = new ModelAndView("listarProdutos");

        List<Produto> produtos = this.service.getProduto();
        mv.addObject("ProductList", produtos);
        return mv; 

    }

    @PostMapping("/saveProdutos")
    public ModelAndView salvarProduto(@ModelAttribute @Valid Produto produto, BindingResult result, 
          RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return new ModelAndView("redirect erro");
        }
        service.Salvar(produto);
        return new ModelAndView("redirect:/produtos/listarTodosProdutos");
    }



}
package com.projetoWeb.myApp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  UUID IdProduto;

    @Column(name = "precoProduto", nullable=false)
    @NotBlank
    private Double  preco;

    @Column(name = "nameProduto", nullable=false)
    @NotBlank
    private String name;

    @Column(name = "quantidade", nullable=false)
    @NotBlank
    private String quantidade;

    @Column(name = "marcaProduto")
    String marca;  

}

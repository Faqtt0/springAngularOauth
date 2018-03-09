package com.algamoneyapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="CATEGORIA")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
}

package com.algamoneyapi.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
@Data
class Endereco {
   @Size(min = 5 , max = 100)
   private String logradouro;

   @Size(min = 1, max = 15)
   private String numero;

   @Size(min = 3, max = 50)
   private String complemento;

   @Size(min = 5, max = 80)
   private String bairro;

   @Size(min = 8, max = 10)
   private String cep;

   @Size(min = 5, max = 60)
   private String cidade;

   @Size(min = 3, max = 60)
   private String estado;
}

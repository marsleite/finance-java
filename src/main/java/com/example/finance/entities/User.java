package com.example.finance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // utilizo para indicar ao JPA que essa classe é uma entidade.
@Data // utilizo para gerar os métodos getters e setters, toString, equals e hashCode.
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String email;
  private String password;
}

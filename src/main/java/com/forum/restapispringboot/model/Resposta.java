package com.forum.restapispringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Resposta {
    @Id
    @GeneratedValue
    private Long id;
    private String mensagem;
    @ManyToOne
    private Topico topico;
    @ManyToOne
    private Autor autor;
    private String solucao;
}

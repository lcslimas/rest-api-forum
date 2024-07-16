package com.forum.restapispringboot.model;

import com.forum.restapispringboot.model.constants.CategoriaTopico;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Curso {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private CategoriaTopico categoria;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaTopico getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTopico categoria) {
        this.categoria = categoria;
    }
}

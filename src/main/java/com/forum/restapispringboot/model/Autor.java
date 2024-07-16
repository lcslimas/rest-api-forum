package com.forum.restapispringboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Autor {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String senha;
    @ManyToMany
    private List<Perfil> perfis;
}

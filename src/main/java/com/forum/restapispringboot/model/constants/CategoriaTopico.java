package com.forum.restapispringboot.model.constants;

import lombok.Getter;

@Getter
public enum CategoriaTopico {
    GERAL('G'),
    HUMOR('H');
    private Character categoria;

    CategoriaTopico(Character categoria) {
        this.categoria = categoria;
    }
}

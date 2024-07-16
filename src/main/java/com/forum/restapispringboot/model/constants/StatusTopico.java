package com.forum.restapispringboot.model.constants;

import lombok.Getter;

@Getter
public enum StatusTopico {
    ABERTO('A'),
    CANCELADO('C');

    private Character status;

    private StatusTopico(Character status) {
        this.status = status;
    }
}

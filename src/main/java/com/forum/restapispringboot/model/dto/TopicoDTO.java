package com.forum.restapispringboot.model.dto;

import com.forum.restapispringboot.model.Autor;
import com.forum.restapispringboot.model.Curso;
import com.forum.restapispringboot.model.Resposta;
import com.forum.restapispringboot.model.constants.StatusTopico;

import java.util.Date;
import java.util.List;

public record TopicoDTO(String titulo, String mensagem, Date dataCriacao, StatusTopico status, Autor autor, Curso curso, List<Resposta> respostas) {
}

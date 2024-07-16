package com.forum.restapispringboot.model;

import com.forum.restapispringboot.model.constants.StatusTopico;
import com.forum.restapispringboot.model.dto.TopicoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Topico {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String mensagem;
    private Date dataCriacao;
    @Enumerated(EnumType.STRING)
    private StatusTopico status;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Curso curso;
    @OneToMany
    private List<Resposta> respostas;

    public Topico(TopicoDTO dto) {
        this.titulo = dto.titulo();
        this.mensagem = dto.mensagem();
        this.dataCriacao = dto.dataCriacao();
        this.autor = dto.autor();
        this.curso = dto.curso();
        this.respostas = dto.respostas();
    }

    public TopicoDTO toDTO() {
        return new TopicoDTO(this.titulo, this.mensagem, this.dataCriacao, this.status, this.autor, this.curso, this.respostas);
    }
}

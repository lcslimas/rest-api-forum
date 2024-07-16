package com.forum.restapispringboot.controller;

import com.forum.restapispringboot.model.Topico;
import com.forum.restapispringboot.model.dto.TopicoDTO;
import com.forum.restapispringboot.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<TopicoDTO> save(@RequestBody TopicoDTO dto) {
        Topico topico = topicoService.save(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(topico.getId())
                .toUri();
        return ResponseEntity.created(location).body(topico.toDTO());
    }
}

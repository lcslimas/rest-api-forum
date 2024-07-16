package com.forum.restapispringboot.service;

import com.forum.restapispringboot.model.Topico;
import com.forum.restapispringboot.model.dto.TopicoDTO;
import com.forum.restapispringboot.repository.TopicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoServiceImpl implements TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    @Override
    @Transactional
    public Topico save(TopicoDTO dto) {
        Topico topico = new Topico(dto);
        return topicoRepository.save(topico);
    }
}

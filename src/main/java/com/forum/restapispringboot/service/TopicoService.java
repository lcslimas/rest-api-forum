package com.forum.restapispringboot.service;

import com.forum.restapispringboot.model.Topico;
import com.forum.restapispringboot.model.dto.TopicoDTO;

public interface TopicoService {
    Topico save(TopicoDTO topico);
}

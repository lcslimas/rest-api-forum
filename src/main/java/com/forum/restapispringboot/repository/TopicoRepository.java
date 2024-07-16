package com.forum.restapispringboot.repository;

import com.forum.restapispringboot.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}

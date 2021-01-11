package com.alda.repositorio;

import com.alda.modelo.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApostaRepositorio extends JpaRepository<Aposta, Long> {
    List<Aposta> findByEmail(String email);
}

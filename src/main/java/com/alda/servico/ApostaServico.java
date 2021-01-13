package com.alda.servico;

import com.alda.modelo.Aposta;
import com.alda.repositorio.ApostaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
public class ApostaServico {

    @Autowired
    private ApostaRepositorio repositorio;

    public Aposta criarAposta(String email) {
        Aposta aposta = new Aposta();
        aposta.setEmail(email);

        Random random = new Random();
        aposta.setNumero(random.nextInt(10));

        aposta.setData(LocalDate.now());

        return repositorio.save(aposta);
    }

    public List<Aposta> listarApostas(String email) {
        return repositorio.findByEmailOrderByDataDesc(email);
    }
}

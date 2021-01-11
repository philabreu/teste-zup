package com.alda.servico;

import com.alda.modelo.Aposta;
import com.alda.repositorio.ApostaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
        aposta.setNumeros(Arrays.asList(random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10)));

        return repositorio.save(aposta);
    }

    public List<Aposta> listarApostas(String email) {
        return repositorio.findByEmail(email);
    }
}

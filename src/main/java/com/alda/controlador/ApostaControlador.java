package com.alda.controlador;

import com.alda.modelo.Aposta;
import com.alda.servico.ApostaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Valid;
import java.util.List;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/aposta")
public class ApostaControlador {

    @Autowired
    private ApostaServico servico;

    @ResponseBody
    @PostMapping
    public ResponseEntity<?> criarAposta(@Valid @RequestBody String email){
        if(isNull(email)){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }

        Aposta aposta = servico.criarAposta(email);
        return ResponseEntity.status(HttpStatus.CREATED).body(aposta);
    }

    @ResponseBody
    @GetMapping("/{email}")
    public ResponseEntity<?> listarApostas(@PathVariable String email){
        if(isNull(email)){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }

        List<Aposta> apostas = servico.listarApostas(email);
        return ResponseEntity.status(HttpStatus.CREATED).body(apostas);
    }

}

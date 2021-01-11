package com.alda.modelo;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table
@Entity
public class Pessoa {
    @NotBlank
    private String email;

    @NotNull
    private Aposta aposta;

    public String getEmail() {
        return email;
    }

    public Aposta getAposta() {
        return aposta;
    }
}

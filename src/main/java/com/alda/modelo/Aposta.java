package com.alda.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Table
@Entity
public class Aposta {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private List<Integer> numeros;

    @NotBlank
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}

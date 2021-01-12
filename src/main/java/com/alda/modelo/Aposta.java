package com.alda.modelo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;

@Table(name = "aposta")
@Entity
public class Aposta {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(name = "numeros")
    private List<Integer> numeros;

    @NotBlank
    @Column(name = "email")
    private String email;

    @Column(name = "data_criacao")
    private LocalDate data;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

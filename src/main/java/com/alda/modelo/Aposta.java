package com.alda.modelo;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Table(name = "aposta")
@Entity
public class Aposta {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(name = "numeros")
    private Integer numero;

    @NotBlank
    @Column(name = "email")
    private String email;

    @Column(name = "data_criacao")
    private LocalDate data;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

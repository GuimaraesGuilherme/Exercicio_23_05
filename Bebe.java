package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Table(name = "bebe")

public class Bebe {
    @Id
    @Column(name = "cpf_bebe")
    @NotNull
    private int cpf_bebe;

    @Column(name = "nome_bebe", length = 100)
    @NotNull
    private String nome_bebe;

    @Column(name = "data_nascimento_bebe")
    @NotNull
    private LocalDate dataNascimento_bebe;

    @Column(name = "altura_bebe")
    @NotNull
    private float altura_bebe;
}

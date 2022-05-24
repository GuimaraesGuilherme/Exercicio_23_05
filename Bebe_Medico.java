package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "bebe_medico")
public class Bebe_Medico {

    @Id
    @OneToMany
    @JoinColumn(name = "cpf_bebe")
    @NotNull
    private Bebe bebe;

    @Id
    @OneToMany
    @JoinColumn(name = "medico_crm")
    @NotNull
    private Medico medico;

}

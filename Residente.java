package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Table(name = "residente")
public class Residente {

    @Id
    @OneToOne
    @JoinColumn(name = "medico_crm")
    @NotNull
    private Medico medico;

    @Column(name = "instituicao", length = 100)
    @NotNull
    private String instituicao_ensino_residente;

    @Column(name = "ano_ingresso_residente")
    @NotNull
    private LocalDate ano_ingresso_residente;

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getInstituicao_ensino_residente() {
        return instituicao_ensino_residente;
    }

    public void setInstituicao_ensino_residente(String instituicao_ensino_residente) {
        this.instituicao_ensino_residente = instituicao_ensino_residente;
    }

    public LocalDate getAno_ingresso_residente() {
        return ano_ingresso_residente;
    }

    public void setAno_ingresso_residente(LocalDate ano_ingresso_residente) {
        this.ano_ingresso_residente = ano_ingresso_residente;
    }
}

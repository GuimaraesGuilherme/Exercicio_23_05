package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @Column(name = "crm_medico")
    @NotNull
    private int crm_medico;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nome;

    @Column(name = "telefone", length = 11)
    @NotNull
    private String telefone;

    @Column(name = "especialidade", length = 55)
    @NotNull
    private String especialidade;

    public int getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(int crm_medico) {
        this.crm_medico = crm_medico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

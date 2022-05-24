package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Table(name = "mae")
public class Mae {

    @Id
    @Column(name = "cpf_mae")
    @NotNull
    private int cpf_mae;

    @Column(name = "nome_mae", length = 100)
    @NotNull
    private String nome_mae;

    @Column(name = "logradouro_mae")
    @NotNull
    private String logradouro_mae;

    @Column(name = "numeroend_mae")
    @NotNull
    private String numeroend_mae;

    @Column(name = "cep_mae")
    @NotNull
    private String cep_mae;

    @Column(name = "complementoend_mae")
    private String complementoend_mae;

    @Column(name = "telefone", length = 11)
    @NotNull
    private String telefone;

    @Column(name = "data_nascimento_mae")
    @NotNull
    private LocalDate dataNascimento_mae;

    public int getCpf_mae() {
        return cpf_mae;
    }

    public void setCpf_mae(int cpf_mae) {
        this.cpf_mae = cpf_mae;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getLogradouro_mae() {
        return logradouro_mae;
    }

    public void setLogradouro_mae(String logradouro_mae) {
        this.logradouro_mae = logradouro_mae;
    }

    public String getNumeroend_mae() {
        return numeroend_mae;
    }

    public void setNumeroend_mae(String numeroend_mae) {
        this.numeroend_mae = numeroend_mae;
    }

    public String getCep_mae() {
        return cep_mae;
    }

    public void setCep_mae(String cep_mae) {
        this.cep_mae = cep_mae;
    }

    public String getComplementoend_mae() {
        return complementoend_mae;
    }

    public void setComplementoend_mae(String complementoend_mae) {
        this.complementoend_mae = complementoend_mae;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento_mae() {
        return dataNascimento_mae;
    }

    public void setDataNascimento_mae(LocalDate dataNascimento_mae) {
        this.dataNascimento_mae = dataNascimento_mae;
    }
}
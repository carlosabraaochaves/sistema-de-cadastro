package com.cadastro.app.carlosdev.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long>{



    @Column(name = "FUNCIONARIOS", unique = true)
    private String nome;

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;

    @Column(name= "data_entrada" , nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @Column(name= "data_saida" ,  columnDefinition = "DATE")
    private LocalDate dataSaida;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "endereco_id_fk")
    private String endereco;

    @ManyToOne
    @JoinColumn(name ="cargo_id_fk")
    private String cargo;

    // LISTA DE FUNCIONARIOS


    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

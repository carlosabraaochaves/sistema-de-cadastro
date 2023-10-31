package com.cadastro.app.carlosdev.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne // LÊ-SE DA DIREITA PARA A ESQUERDA => UM DEPARTAMENTO PODE TER VARIOS CARGOS
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

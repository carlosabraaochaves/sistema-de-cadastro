package com.cadastro.app.carlosdev.dao;

import com.cadastro.app.carlosdev.domain.Departamento;
import com.cadastro.app.carlosdev.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update (Funcionario funcionario);


    void delete(Long id);


    Funcionario findById(Long id);

    List<Funcionario> findAll();
}

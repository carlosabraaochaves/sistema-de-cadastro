package com.cadastro.app.carlosdev.service;

import com.cadastro.app.carlosdev.domain.Cargo;
import com.cadastro.app.carlosdev.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {



    void save(Funcionario funcionario);

    void update (Funcionario funcionario);


    void delete(Long id);


   Funcionario findById(Long id);

    List<Funcionario> findAll();
}

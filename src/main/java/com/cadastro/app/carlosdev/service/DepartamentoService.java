package com.cadastro.app.carlosdev.service;

import com.cadastro.app.carlosdev.domain.Cargo;
import com.cadastro.app.carlosdev.domain.Departamento;

import java.util.List;

public interface DepartamentoService {



    void salvar(Departamento departamento);

    void editar(Departamento departamento);


    void excuir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();

}

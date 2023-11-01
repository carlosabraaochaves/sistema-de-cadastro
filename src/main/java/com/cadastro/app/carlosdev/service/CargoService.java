package com.cadastro.app.carlosdev.service;


import com.cadastro.app.carlosdev.domain.Cargo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CargoService {


    void salvar(Cargo cargo);

    void editar(Cargo cargo);


    void excuir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();



}

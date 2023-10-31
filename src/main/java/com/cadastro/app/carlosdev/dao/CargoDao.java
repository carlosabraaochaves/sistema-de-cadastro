package com.cadastro.app.carlosdev.dao;

import com.cadastro.app.carlosdev.domain.Cargo;
import com.cadastro.app.carlosdev.domain.Departamento;

import java.util.List;

public interface CargoDao {


    void save(Cargo cargo);

    void update (Cargo cargo);


    void delete(Long id);


    Cargo findById(Long id);

    List<Cargo> findAll();



}

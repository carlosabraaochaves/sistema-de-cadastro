package com.cadastro.app.carlosdev.service;

import com.cadastro.app.carlosdev.dao.DepartamentoDao;
import com.cadastro.app.carlosdev.domain.Cargo;
import com.cadastro.app.carlosdev.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class DepartamentoServiceImpl implements DepartamentoService{




    @Autowired
    private DepartamentoDao dao;


    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {

        dao.save(departamento);

    }
    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {

        dao.update(departamento);

    }
    @Transactional(readOnly = false)
    @Override
    public void excuir(Long id) {

        dao.delete(id);

    }
    @Transactional(readOnly = true)
    @Override
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Departamento> buscarTodos() {
        return dao.findAll();
    }
}

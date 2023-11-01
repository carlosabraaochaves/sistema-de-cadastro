package com.cadastro.app.carlosdev.service;

import com.cadastro.app.carlosdev.dao.FuncionarioDao;
import com.cadastro.app.carlosdev.domain.Cargo;
import com.cadastro.app.carlosdev.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao dao;



    @Transactional(readOnly = false)
    @Override
    public void save(Funcionario funcionario) {
        dao.save(funcionario);

    }
    @Transactional(readOnly = false)
    @Override
    public void update(Funcionario funcionario) {

        dao.update(funcionario);

    }
    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {

        dao.delete(id);

    }
    @Transactional(readOnly = true)
    @Override
    public Funcionario findById(Long id) {
        return dao.findById(id);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Funcionario> findAll() {
        return dao.findAll();
    }
}

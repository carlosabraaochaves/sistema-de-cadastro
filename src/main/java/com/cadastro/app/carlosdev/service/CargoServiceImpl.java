package com.cadastro.app.carlosdev.service;

import com.cadastro.app.carlosdev.dao.CargoDao;
import com.cadastro.app.carlosdev.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Transactional(readOnly = false)
@Service
public class CargoServiceImpl implements CargoService{


    // TENDO ACESSO AO METODOS DO DAO
        @Autowired
        private  CargoDao dao;
    @Override
    public void salvar(Cargo cargo) {
                dao.save(cargo);


    }

    @Override
    public void editar(Cargo cargo) {
                dao.update(cargo);


    }

    @Override
    public void excuir(Long id) {
        dao.delete(id);

    }


    @Transactional(readOnly =true)
    @Override
    public Cargo buscarPorId(Long id) {
        return dao.findById(id);
    }


    @Transactional(readOnly =true)
    @Override
    public List<Cargo> buscarTodos() {
        return dao.findAll();
    }
}

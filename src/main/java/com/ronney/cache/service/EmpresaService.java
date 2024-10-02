package com.ronney.cache.service;

import com.ronney.cache.entity.Empresa;
import com.ronney.cache.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> finadAll() {
        return (List<Empresa>) empresaRepository.findAll();
    }
}

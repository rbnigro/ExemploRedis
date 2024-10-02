package com.ronney.cache.controller;

import com.ronney.cache.entity.Empresa;
import com.ronney.cache.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/cosulta")
    public ResponseEntity<List<Empresa>> findAll() {
        return ResponseEntity.ok(empresaService.finadAll());
    }
}

package com.ronney.cache.service;

import com.ronney.cache.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CacheService {

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private EmpresaService empresaService;

    public void evictAllCacheValues(String cacheName){

    }

    @CachePut("empresas")
    public List<Empresa> atualizarCacheEmpresas() {
        return empresaService.findAll();
    }

    public void limpaCache(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
    }
}

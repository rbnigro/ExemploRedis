package com.ronney.cache.controller;

import com.ronney.cache.service.CacheService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @PostMapping
    public void limparCache(@RequestParam("cacheName") String cacheName) {
        cacheService.evictAllCacheValues(cacheName); // limpaCache(cacheName);
    }

    @PutMapping("/atualizar")
    public void atualizar() {
        cacheService.atualizarCacheEmpresas();
        log.info("Cache Atualizado");
    }
}

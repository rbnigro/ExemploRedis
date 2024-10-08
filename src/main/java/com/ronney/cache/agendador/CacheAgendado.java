package com.ronney.cache.agendador;

import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
@Log4j2
public class CacheAgendado {

    @Scheduled(fixedDelay = 10, timeUnit = TimeUnit.MINUTES)
    @CacheEvict("empresas")
    public void limparCacheEmopresas() {
        log.info("Executou: " + LocalDateTime.now());
    }
}

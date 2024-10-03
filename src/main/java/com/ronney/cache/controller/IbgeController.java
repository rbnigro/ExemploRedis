package com.ronney.cache.controller;

import com.ronney.cache.cloud.IbgeResponse;
import com.ronney.cache.service.IbgeService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/ibge")
public class IbgeController {

    @Autowired
    private IbgeService ibgeService;

    @GetMapping
    public ResponseEntity<List<IbgeResponse>> findAllCidades(@RequestParam String estado) {
        return ResponseEntity.ok(ibgeService.findAllCidades(estado));
    }

}

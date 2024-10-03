package com.ronney.cache.service;

import com.ronney.cache.cloud.Ibge;
import com.ronney.cache.cloud.IbgeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IbgeService {

    @Autowired
    private Ibge ibge;

    @Cacheable(value = "estados", condition = "#estado.equalsIgnoreCase('MG')")
    public List<IbgeResponse> findAllCidades(String estado) {
        return ibge.findAllCidades(estado);
    }
}

package com.ronney.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.sql.*;

@SpringBootApplication
// @EnableScheduling
@EnableCaching
@EnableFeignClients
public class CacheApplication {

	public static void main(String[] args) throws SQLException {
			SpringApplication.run(CacheApplication.class, args);
	}
}

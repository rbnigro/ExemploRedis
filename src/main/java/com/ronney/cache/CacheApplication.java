package com.ronney.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class CacheApplication {

	public static void main(String[] args) throws SQLException {
			SpringApplication.run(CacheApplication.class, args);
	}
}

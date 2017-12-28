package com.shensk.web.rpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shensk.web.dao.mapper")
public class ShenskWebRpcServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShenskWebRpcServiceApplication.class, args);
	}
}

package com.shensk.web.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shensk.web.rpc.api.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShenskWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShenskWebClientApplication.class, args);
	}
}

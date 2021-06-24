package com.mall.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gaowensong
 * @date 2021/5/10
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

	public static void main(String[] args) {
		SpringApplication.run(com.mall.app.AppEureka.class, args);
	}
}

package com.xyy.boot.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages={"com.xyy.boot.dao"})
@EntityScan(basePackages="com.xyy.boot.model")
@SpringBootApplication(scanBasePackages={"com.xyy.boot"})
public class Application {
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(Application.class, args);
	    }
}

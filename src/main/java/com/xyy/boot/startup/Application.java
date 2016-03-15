package com.xyy.boot.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableJpaRepositories(basePackages={"com.xyy.boot.dao"})
@EntityScan(basePackages="com.xyy.boot.model")
@SpringBootApplication(scanBasePackages={"com.xyy.boot"})
@EnableScheduling
public class Application {
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(Application.class, args);
	    }
}

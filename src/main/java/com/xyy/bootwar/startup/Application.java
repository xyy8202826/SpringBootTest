package com.xyy.bootwar.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories(basePackages={"com.xyy.bootwar.dao"})
@EntityScan(basePackages="com.xyy.bootwar")
public class Application extends SpringBootServletInitializer{
	 @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(Application.class);
	  }
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
}

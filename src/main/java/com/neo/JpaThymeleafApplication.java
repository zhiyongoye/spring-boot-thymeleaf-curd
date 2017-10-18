package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/***
 * @SpringBootApplication：是一个组合注解 ，包括@EnableAutoConfiguration及其他多个注解，是一个项目的启动注解
 **/
@SpringBootApplication
public class JpaThymeleafApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JpaThymeleafApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaThymeleafApplication.class, args);
	}
}

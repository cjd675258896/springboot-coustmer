package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:spring-dubbo-consumer.xml"})
public class SpringbootCoustmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCoustmerApplication.class, args);
	}
}

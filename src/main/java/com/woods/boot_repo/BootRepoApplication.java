package com.woods.boot_repo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woods.boot_repo.mapper")
public class BootRepoApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootRepoApplication.class, args);
	}
}

package com.joey.fangxing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.joey.fangxing.mapper")
public class FangxingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FangxingApplication.class, args);
	}
}

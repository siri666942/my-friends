package com.siri.springboot;

import com.siri.springboot.bean.User;
import com.siri.springboot.controller.UserController;
import com.siri.springboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.siri.springboot.mapper")
public class Springboot13SsmApplication {

	public static void main(String[] args) {

SpringApplication.run(Springboot13SsmApplication.class, args);


	}

}

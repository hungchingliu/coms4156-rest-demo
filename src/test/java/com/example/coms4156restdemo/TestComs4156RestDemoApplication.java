package com.example.coms4156restdemo;

import org.springframework.boot.SpringApplication;

public class TestComs4156RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(Coms4156RestDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

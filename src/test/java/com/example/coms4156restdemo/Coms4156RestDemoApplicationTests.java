package com.example.coms4156restdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Coms4156RestDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

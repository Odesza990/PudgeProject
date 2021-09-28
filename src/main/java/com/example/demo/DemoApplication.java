package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Predicate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Predicate<String> predicate = (str) -> str.length() > 0;
		boolean result = predicate.test("sjldfsjdflk");

	}

}

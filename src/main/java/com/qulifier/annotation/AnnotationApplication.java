package com.qulifier.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("student")
	private Person person;

	public static void main(String[] args) {
		SpringApplication.run(AnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		person.work();
	}

}

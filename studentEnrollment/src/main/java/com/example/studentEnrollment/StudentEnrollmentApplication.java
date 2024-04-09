package com.example.studentEnrollment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class StudentEnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEnrollmentApplication.class, args);
		System.out.println("Started");
	}

}

// Comment 5

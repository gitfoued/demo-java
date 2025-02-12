package com.example.demo;

import com.example.demo.student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);

////		MyFirstComponent myFirstComponent= tx.getBean(MyFirstComponent.class);
//		System.out.println(myFirstService.tellAStory());
//		System.out.println(myFirstService.getJavaVersion());
//		System.out.println(myFirstService.getValueFromFile());
	}
}

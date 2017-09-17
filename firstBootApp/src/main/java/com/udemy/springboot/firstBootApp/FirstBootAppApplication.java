package com.udemy.springboot.firstBootApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstBootAppApplication.class, args);
		/*for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}
}

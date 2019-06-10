package edu.mum.cs.cs425.elibrary;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ElibraryLab8Application extends SpringBootServletInitializer{
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ElibraryLab8Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ElibraryLab8Application.class, args);
	}

}



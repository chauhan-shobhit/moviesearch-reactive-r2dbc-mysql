package com.shobhit.r2dbc.moviesearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MoviesearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesearchApplication.class, args);
	}

}

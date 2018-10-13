package com.trackerweb.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Bujair
 *
 */
@SpringBootApplication
@ComponentScan("com.trackerweb")
public class MyAPIApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MyAPIApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}

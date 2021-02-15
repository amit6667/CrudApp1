package com.credApp.credApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CredAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredAppApplication.class, args);
	}

	/*
	 * @Bean public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	 * return new CommandLineRunner() {
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("Hello World"); } }; }
	 */
}
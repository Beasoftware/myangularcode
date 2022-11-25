package com.dev.neo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//import com.dev.neo.repository.UserRepository;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.dev.neo.controller","com.dev.neo.repository"})
public class SpringBootUserAppWithFrontend1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserAppWithFrontend1Application.class, args);
	}
	/*
	 * @Autowired private UserRepository userRepository;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * this.userRepository.save("Arif","khan","arif@gmail.com","1982-11-17");
	 * this.userRepository.save("Raja","ravi","raja@gmail.com","1983-10-17");
	 * this.userRepository.save("Mayur","patil","patil@gmail.com","1988-1-17");
	 * 
	 * 
	 * }
	 */

}

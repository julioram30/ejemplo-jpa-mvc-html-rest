package com.cairone.appexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner 
{
	@Override
	public void run(String... arg0) throws Exception {
	}
	
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}

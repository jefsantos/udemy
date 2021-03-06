package com.jeferson.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jeferson.cursomc.services.DBService;
import com.jeferson.cursomc.services.EmailService;
import com.jeferson.cursomc.services.MockEmailService;

@Configuration
@Profile("test")
public class TesteConfig {

	@Autowired
	private DBService dbservice;

	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbservice.instantiateTestDatabase();
		return true;
	}

@Bean
public EmailService emailService()
	{
		return new MockEmailService();
	}
}

package com.jeferson.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

public class SmtpEmailService  extends AbstractEmailService{

	
	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private JavaMailSender  javaMailSender; 
	
	private static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);
	
	@Override
	public void sendEamil(SimpleMailMessage msg) {
		LOG.info("Enviando Email simulado");
		mailSender.send(msg);
		LOG.info("Enviado");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Enviando Email simulado");
		javaMailSender.send(msg);
		LOG.info("Enviado");		
	}

}

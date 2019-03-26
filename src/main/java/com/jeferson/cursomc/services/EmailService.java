package com.jeferson.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.jeferson.cursomc.domain.Pedido;

@Service
public interface EmailService {

	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEamil (SimpleMailMessage msg);
	
	
	/////////////////////////////////////////
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
}



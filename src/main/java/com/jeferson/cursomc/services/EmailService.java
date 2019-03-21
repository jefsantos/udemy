package com.jeferson.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jeferson.cursomc.domain.Pedido;

public interface EmailService {

	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEamil (SimpleMailMessage msg);
}



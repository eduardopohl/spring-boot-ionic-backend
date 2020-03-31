package com.eduardopohl.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eduardopohl.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}

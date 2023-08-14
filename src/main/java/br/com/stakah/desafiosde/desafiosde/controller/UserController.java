package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {
    private final ProcessPayment service;

    final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    UserController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}/email")
    public String sendEmail(@PathVariable("id") Long id) {
        // Gera envio de email
        LOGGER.info(String.format("[sendEmail] id: %d", id));
        return "new email sent";
    }

    @PutMapping("/{id}/notification")
    public String sendNotification(@PathVariable("id") Long id) {
        // Gera envio de aviso
        LOGGER.info(String.format("[sendNotification] id: %d", id));
        return "new notification sent";
    }
}

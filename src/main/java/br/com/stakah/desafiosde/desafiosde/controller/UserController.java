package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {
    private final ProcessPayment service;

    UserController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}/email")
    public String sendEmail(@PathVariable("id") Long id) {
        // Gera envio de email
        return "new email sent";
    }

    @PutMapping("/{id}/notification")
    public String sendNotification(@PathVariable("id") Long id) {
        // Gera envio de aviso
        return "new notification sent";
    }
}

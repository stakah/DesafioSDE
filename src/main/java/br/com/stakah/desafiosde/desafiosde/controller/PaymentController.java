package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.model.dto.PaymentDTO;
import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "payments")
public class PaymentController {
    private final ProcessPayment service;

    PaymentController(ProcessPayment service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Payment> getPayment(@PathVariable("id") Long id) {
        return service.getPayment(id);
    }

    @PostMapping("/{id}")
    public String updatePayment(@PathVariable("id") Long id, @RequestBody PaymentDTO paymentDTO) {
        Payment payment = service.updatePayment(id, paymentDTO);
        return "OK";
    }
}

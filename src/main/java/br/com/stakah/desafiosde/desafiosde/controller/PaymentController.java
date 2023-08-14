package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.model.dto.PaymentDTO;
import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "payments")
public class PaymentController {
    private final ProcessPayment service;

    final static Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

    PaymentController(ProcessPayment service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Payment> getPayment(@PathVariable("id") Long id) {
        LOGGER.info(String.format("[getPayment] id: %d", id));
        return service.getPayment(id);
    }

    @PostMapping("/{id}")
    public String updatePayment(@PathVariable("id") Long id, @RequestBody PaymentDTO paymentDTO) {
        LOGGER.info(String.format("[updatePayment] id: %d", id));
        Payment payment = service.updatePayment(id, paymentDTO);
        return "OK";
    }
}

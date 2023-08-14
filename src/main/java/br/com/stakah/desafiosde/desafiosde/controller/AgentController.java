package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.model.dto.PaymentDTO;
import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "agents")
public class AgentController {
    private final ProcessPayment service;

    AgentController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}/commissions")
    public String addAgentCommission(@PathVariable("id") Long id) {
        // Gera pagamento de comissao
        return "new agent";
    }

}

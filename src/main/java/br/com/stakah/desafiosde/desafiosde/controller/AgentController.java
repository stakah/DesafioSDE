package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.model.dto.PaymentDTO;
import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "agents")
public class AgentController {
    private final ProcessPayment service;

    final static Logger LOGGER = LoggerFactory.getLogger(AgentController.class);

    AgentController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}/commissions")
    public String addAgentCommission(@PathVariable("id") Long id) {
        // Gera pagamento de comissao
        LOGGER.info(String.format("[addAgentCommission] id: %d", id));
        return "new agent";
    }

}

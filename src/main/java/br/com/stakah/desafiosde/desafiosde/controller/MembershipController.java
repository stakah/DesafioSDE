package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "memberships")
public class MembershipController {
    private final ProcessPayment service;

    final static Logger LOGGER = LoggerFactory.getLogger(MembershipController.class);

    MembershipController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public String addMembership(@PathVariable("id") Long id) {
        // Gera nova associacao de membro
        LOGGER.info(String.format("[addMembership] id: %d", id));
        return "new membership";
    }

    @PostMapping("/{id}")
    public String upgradeMembership(@PathVariable("id") Long id) {
        // Gera nova atualizaçao de membro
        LOGGER.info(String.format("[upgradeMembership] id: %d", id));
        return "membership upgraded";
    }
}

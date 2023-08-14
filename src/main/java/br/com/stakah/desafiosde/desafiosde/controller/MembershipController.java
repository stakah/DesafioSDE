package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "memberships")
public class MembershipController {
    private final ProcessPayment service;

    MembershipController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public String addMembership(@PathVariable("id") Long id) {
        // Gera nova associacao de membro
        return "new membership";
    }

    @PostMapping("/{id}")
    public String upgradeMembership(@PathVariable("id") Long id) {
        // Gera nova atualizaçao de membro
        return "new membership upgrade";
    }
}

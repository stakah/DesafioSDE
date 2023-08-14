package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "products")
public class ProductController {
    private final ProcessPayment service;

    ProductController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}/shipments")
    public String addProductShipment(@PathVariable("id") Long id) {
        // Gera remessa de produto
        return "new product shipping";
    }

    @PutMapping("/{id}/shipments/{remessaId}/duplicate")
    public String addProductDuplicateShipment(@PathVariable("id") Long id, @PathVariable("remessaId") Long remessaId) {
        // Gera duplicata da remessa de produto
        return "new product dulicate shipment";
    }
}

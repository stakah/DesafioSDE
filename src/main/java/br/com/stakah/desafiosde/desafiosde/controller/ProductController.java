package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(path = "products")
public class ProductController {
    private final ProcessPayment service;
    final static Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    ProductController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}/shipments")
    public String addProductShipment(@PathVariable("id") Long id) {
        // Gera remessa de produto
        LOGGER.info(String.format("[addProductShipment] id: %d", id));
        return "new product shipping";
    }

    @PutMapping("/{id}/shipments/{remessaId}/duplicate")
    public String addProductDuplicateShipment(@PathVariable("id") Long id, @PathVariable("remessaId") Long remessaId) {
        // Gera duplicata da remessa de produto
        LOGGER.info(String.format("[addProductDuplicateShipment] id: %d, remessaId: %d", id, remessaId));
        return "new product dulicate shipment";
    }
}

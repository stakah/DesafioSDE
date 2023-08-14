package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "videos")
public class VideoController {
    private final ProcessPayment service;

    VideoController(ProcessPayment service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public String addVideo(@PathVariable("id") Long id) {
        // Adiciona video ao pedido
        return "new video sent";
    }

    @PostMapping("/{id}")
    public String updateVideo(@PathVariable("id") Long id) {
        // Altera video do pedido
        return "new notification sent";
    }
}

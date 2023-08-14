package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "videos")
public class VideoController {
    private final ProcessPayment service;

    final static Logger LOGGER = LoggerFactory.getLogger(VideoController.class);

    private final List<String> videosList = Arrays.asList("Aprender a esquiar", "Primeiros socorros");

    VideoController(ProcessPayment service) {
        this.service = service;
    }

    private String getVideoById(Long id) {
        String videoName = "Unknown";

        if (id == 5) videoName = videosList.get(0);
        else if (id == 6) videoName = videosList.get(1);

        return videoName;
    }
    @PutMapping("/{id}")
    public String addVideo(@PathVariable("id") Long id) {
        // Adiciona video ao pedido
        LOGGER.info(String.format("[addVideo] id: %d", id));
        return String.format("video id:%d (%s) added", id, getVideoById(id));
    }

    @PostMapping("/{id}")
    public String updateVideo(@PathVariable("id") Long id) {
        // Altera video do pedido
        LOGGER.info(String.format("[updateVideo] id: %d", id));
        return String.format("video id:%d (%s) updated", getVideoById(id));
    }
}

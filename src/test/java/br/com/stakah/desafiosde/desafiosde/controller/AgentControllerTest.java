package br.com.stakah.desafiosde.desafiosde.controller;

import br.com.stakah.desafiosde.desafiosde.service.ProcessPayment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AgentController.class)
class AgentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProcessPayment processPayment;

    @Test
    void addAgentCommission() throws Exception {
        this.mockMvc.perform(put("/agents/1/commissions"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("new agent")));
    }
}
package br.com.stakah.desafiosde.desafiosde.service;

import br.com.stakah.desafiosde.desafiosde.model.dto.PaymentDTO;
import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import br.com.stakah.desafiosde.desafiosde.model.entity.PaymentType;
import br.com.stakah.desafiosde.desafiosde.repository.PaymentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProcessPaymentTest {

    @Mock
    PaymentRepository paymentRepository;

    ProcessPayment processPayment;

    private Payment testPayment;

    @BeforeEach
    void init() {
        testPayment = new Payment();
        testPayment.setPaymentId(1L);
        testPayment.setPaymentDate(LocalDate.of(2023, 12, 25));
        PaymentType paymentType = new PaymentType();
        paymentType.setId(2L);
        paymentType.setType("TEST_PAYMENT");
        paymentType.setDescription("teste");
        testPayment.setPaymentType(paymentType);
        testPayment.setProcessDate(LocalDate.of(2023, 12, 31));
        testPayment.setValue(1.0);

    }

    @Test
    void getPayment() {

        Mockito.when(paymentRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(testPayment));


        processPayment = new ProcessPayment(paymentRepository);

        Optional<Payment> actualPayment = processPayment.getPayment(1L);

        assertTrue(actualPayment.isPresent());
    }

    @Test
    void updatePayment() {
        Mockito.when(paymentRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(testPayment));
        processPayment = new ProcessPayment(paymentRepository);

        PaymentDTO paymentDTO = PaymentDTO.builder()
                        .paymentId(testPayment.getPaymentId())
                        .paymentDate("2023-12-25")
                        .processDate("2023-12-31")
                        .value(2.0)
                        .build();

        processPayment.updatePayment(1l, paymentDTO);

        Mockito.verify(paymentRepository, Mockito.atLeastOnce()).findById(Mockito.anyLong());
        Mockito.verify(paymentRepository, Mockito.atLeastOnce()).save(Mockito.any(Payment.class));
    }
}
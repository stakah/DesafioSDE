package br.com.stakah.desafiosde.desafiosde.service;

import br.com.stakah.desafiosde.desafiosde.model.dto.PaymentDTO;
import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import br.com.stakah.desafiosde.desafiosde.repository.PaymentRepository;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class ProcessPayment {
    private final PaymentRepository repository;

    ProcessPayment(PaymentRepository repository) {
        this.repository = repository;
    }

    public Optional<Payment> getPayment(Long id) {
        return repository.findById(id);
    }

    public Payment updatePayment(Long id, PaymentDTO paymentDTO) {
        Payment payment = repository.findById(id).orElse(null);

        payment.setPaymentId(paymentDTO.getPaymentId());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate ldPaymentDate = LocalDate.parse(paymentDTO.getPaymentDate(), df);
        payment.setPaymentDate(ldPaymentDate);

        LocalDate ldProcessDate = LocalDate.parse(paymentDTO.getProcessDate(), df);
        payment.setProcessDate(ldProcessDate);

        repository.save(payment);

        return payment;
    }
}

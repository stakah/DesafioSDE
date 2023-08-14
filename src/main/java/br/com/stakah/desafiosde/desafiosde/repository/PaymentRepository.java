package br.com.stakah.desafiosde.desafiosde.repository;

import br.com.stakah.desafiosde.desafiosde.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

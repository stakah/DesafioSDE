package br.com.stakah.desafiosde.desafiosde.repository;

import br.com.stakah.desafiosde.desafiosde.model.entity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
}

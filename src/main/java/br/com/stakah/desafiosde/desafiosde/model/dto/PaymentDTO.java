package br.com.stakah.desafiosde.desafiosde.model.dto;

import br.com.stakah.desafiosde.desafiosde.model.entity.PaymentType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data

@Builder
public class PaymentDTO {
    private Long id;

    private Long paymentId;

    private Double value;

    private String paymentDate;

    private String processDate;

    private PaymentType paymentType;
}

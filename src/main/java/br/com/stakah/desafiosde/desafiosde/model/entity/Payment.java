package br.com.stakah.desafiosde.desafiosde.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "value")
    private Double value;

    @Column(name = "payment_date")
    private LocalDate paymentDate;

    @Column(name = "process_date")
    private LocalDate processDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_type_id", referencedColumnName = "id")
    private PaymentType paymentType;
}

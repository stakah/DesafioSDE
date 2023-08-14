package br.com.stakah.desafiosde.desafiosde.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payment_type")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "payment_type", nullable = false)
    private String type;

    @Column(name ="description")
    private String description;
}

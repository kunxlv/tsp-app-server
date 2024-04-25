package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "payment_id", nullable = false)
    private Long paymentId;
    private Long customerId;
    private Long staffId;
    private Long rentalId;
    private Double amount;
    private String paymentDate;

}
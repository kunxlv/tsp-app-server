package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id", nullable = false)
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Long addressId;
    @Column(name = "activebool")
    private boolean isActive;
    private Integer active;
    private String createDate;
    private String lastUpdate;
    private Long storeId;
}
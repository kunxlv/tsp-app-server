package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rental")
public class Rental {
    @Id
    @Column(name = "rental_id", nullable = false)
    private Long rentalId;
    private Long inventoryId;
    private Long customerId;
    private String rentalDate;
    private String returnDate;
    private Long staffId;
    private String lastUpdate;


}
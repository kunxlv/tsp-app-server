package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id", nullable = false)
    private Long addressId;
    private String address;
    private String address2;
    private String district;
    private Long cityId;
    private String postalCode;
    private String phone;
    private String lastUpdate;

}
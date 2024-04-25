package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "staff_id", nullable = false)
    private Long staffId;
    private String firstName;
    private String lastName;
    private Long addressId;
    private String email;
    private Long storeId;
    private Long active;
    private String username;
    private String password;
    private String lastUpdate;
    private byte[] picture;

}
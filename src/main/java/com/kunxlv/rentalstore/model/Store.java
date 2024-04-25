package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "store")
public class Store {
    @Id
    @Column(name = "store_id", nullable = false)
    private Long storeId;
    private Long managerStaffId;
    private Long addressId;
    private String lastUpdate;

}
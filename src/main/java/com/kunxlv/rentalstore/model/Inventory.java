package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId;
    private Long filmId;
    private Long storeId;
    private String lastUpdate;

}
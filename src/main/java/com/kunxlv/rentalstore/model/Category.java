package com.kunxlv.rentalstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id", nullable = false)
    private Long categoryId;
    private String name;
    private String lastUpdate;
}

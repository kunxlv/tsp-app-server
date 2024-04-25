package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "country_id", nullable = false)
    private Long countryId;
    private String country;
    private String lastUpdate;

}
package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_id", nullable = false)
    private Long cityId;
    private String city;
    private Long countryId;
    private String lastUpdate;

}
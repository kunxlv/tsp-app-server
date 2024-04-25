package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "film")
public class Film {
    @Id
    @Column(name = "film_id", nullable = false)
    private Long filmId;
    private String title;
    private String description;
    private String releaseYear;
    private Long languageId;
    private Long rentalDuration;
    private Long rentalRate;
    private Long length;
    private Long replacementCost;
    private String rating;
    private String specialFeatures;
    private String lastUpdate;
    private String fulltext;

}
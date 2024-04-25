package com.kunxlv.rentalstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "film_category")
public class FilmCategory {
    @Id
    @Column(name = "film_id", nullable = false)
    private Long filmId;
    private Long categoryId;
    private String lastUpdate;

}
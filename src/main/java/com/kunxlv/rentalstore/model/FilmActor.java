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
@Table(name = "film_actor")
public class FilmActor {
    @Id
    @Column(name = "actor_id", nullable = false)
    private Long actorId;
    private Long filmId;
    private String lastUpdate;

}
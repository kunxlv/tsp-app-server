package com.kunxlv.rentalstore.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @Column(name = "actor_id", nullable = false)
    private Long actorId;
    private String firstName;
    private String lastName;
    private String lastUpdate;

}
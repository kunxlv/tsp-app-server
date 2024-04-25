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
@Table(name = "language")
public class Language {
    @Id
    @Column(name = "language_id", nullable = false)
    private Long languageId;
    private String name;
    private String lastUpdate;

}
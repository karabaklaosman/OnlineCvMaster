package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import lombok.NonNull;

import javax.persistence.*;
@Data

@Entity
public class Beceri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 75)
    private String beceri;
    @Column(length = 25)
    private String seviye;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profil_id", nullable = false)
    @NonNull
    private Profil profil;

    public Beceri() {
    }
}
package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import lombok.NonNull;

import javax.persistence.*;
@Data

@Entity
public class Basarilar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String basari;

    private String aciklama;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profil_id", nullable = false)
    @NonNull
    private Profil profil;

    public Basarilar() {
    }
}

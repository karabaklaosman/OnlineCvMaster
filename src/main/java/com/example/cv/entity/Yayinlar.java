package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
@Data
@Entity
public class Yayinlar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String aciklama;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profil_id", nullable = false)
    @NonNull
    private Profil profil;

    public Yayinlar() {
    }
}

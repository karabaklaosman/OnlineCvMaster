package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
@Data
@Entity
public class Referanslar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String firma;
    @Column(length = 50)
    private String referans_adi;
    @Column(length = 50)
    private String tel_no;
    @Column(length = 50)
    private String email;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profil_id", nullable = false)
    @NonNull
    private Profil profil;
    public Referanslar() {
    }
}

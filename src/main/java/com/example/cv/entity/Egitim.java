package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
public class Egitim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 75)
    private String okul;
    @Column(length = 100)
    private String bolum;
    @Column(length = 25)
    private String sehir;
    private Date bas_tarihi;
    private  Date bit_tarihi;
    private String aciklama;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profil_id", nullable = false)
    @NonNull
    private Profil profil;

    public Egitim() {
    }
}

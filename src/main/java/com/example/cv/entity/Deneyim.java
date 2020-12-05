package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity

@Data
public class Deneyim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 75)
    private String unvan;
    @Column(length = 25)
    private String sehir;
    @Column(length = 100)
    private String firma;
    private Date bas_tarihi;
    private  Date bit_tarihi;
    private String aciklama;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profil_id", nullable = false)
    @NonNull
    private Profil profil;

    public Deneyim() {
    }
}

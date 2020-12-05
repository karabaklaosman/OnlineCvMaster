package com.example.cv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Profil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] profilePicture;

    @NonNull
    @Column(length = 25)
    private String isim;
    @NonNull
    @Column(length = 25)
    private String soy_isim;
    @NonNull
    @Column(length = 75)
    private String email;
    @NonNull
    @Column(length = 15)
    private String tel;
    @Column(length = 250)
    private String adres;
    @Column(length = 25)
    private String posta_kodu;
    @Column(length = 25)
    private String sehir;


    @Column(length = 250)
    private String dogum_tarihi;
    @Column(length = 100)
    private String dogum_yeri;
    @Column(length = 20)
    private String ehliyet;
    @Column(length = 5)
    private String cinsiyet;

    @Column(length = 50)
    private String uyruk;
    @Column(length = 25)
    private String medeni_hali;

    @Column(length = 25)
    private String askerlik_durumu;

    private String linkedln;
    private String internet_adresi;

    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Deneyim> Deneyimler;

    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Egitim> egitims;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Ilgiler> ılgilers;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Referanslar> referanslars;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Beceri> beceris;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Diller> dillers;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Basarilar> basarilars;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Kurslar> kurslars;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Yayinlar> yayinlars;
    @JsonIgnore
    @OneToMany(mappedBy = "profil", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<Ozel> ozels;


    public Profil() {
    }
}

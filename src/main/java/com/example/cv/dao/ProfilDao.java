package com.example.cv.dao;

import com.example.cv.entity.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilDao extends JpaRepository<Profil,Integer> {

}

package com.example.cv.dao;

import com.example.cv.entity.Egitim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EgitimDao extends JpaRepository<Egitim,Integer> {
    List<Egitim> findAllByProfil_Id(int id);
}



package com.example.cv.dao;

import com.example.cv.entity.Referanslar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferanslarDao extends JpaRepository<Referanslar,Integer> {
    List<Referanslar> findAllByProfil_Id(int id);
}

package com.example.cv.dao;

import com.example.cv.entity.Basarilar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface BasarilarDao extends JpaRepository<Basarilar,Integer> {
    List<Basarilar> findAllByProfil_Id(int id);
    }

package com.example.cv.dao;

import com.example.cv.entity.Yayinlar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YayınlarDao extends JpaRepository<Yayinlar,Integer> {
    List<Yayinlar> findAllByProfil_Id(int id);
}

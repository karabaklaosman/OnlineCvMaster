package com.example.cv.dao;

import com.example.cv.entity.Beceri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BeceriDao  extends JpaRepository<Beceri,Integer> {
    List<Beceri> findAllByProfil_Id(int id);
}

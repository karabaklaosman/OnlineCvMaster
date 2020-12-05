package com.example.cv.dao;

import com.example.cv.entity.Diller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DillerDao extends JpaRepository<Diller,Integer> {
    List<Diller> findAllByProfil_Id(int id);
}

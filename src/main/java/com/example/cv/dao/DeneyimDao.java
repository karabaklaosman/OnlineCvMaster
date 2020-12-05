package com.example.cv.dao;

import com.example.cv.entity.Deneyim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeneyimDao extends JpaRepository<Deneyim,Integer> {
    List<Deneyim> findAllByProfil_Id(int id);

}

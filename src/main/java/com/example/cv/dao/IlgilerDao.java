package com.example.cv.dao;

import com.example.cv.entity.Ilgiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IlgilerDao extends JpaRepository<Ilgiler,Integer> {
    List<Ilgiler> findAllByProfil_Id(int id);
}

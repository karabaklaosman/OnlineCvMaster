package com.example.cv.dao;

import com.example.cv.entity.Ozel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OzelDao extends JpaRepository<Ozel,Integer> {
    List<Ozel> findAllByProfil_Id(int id);
}

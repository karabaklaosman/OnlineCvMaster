package com.example.cv.dao;


import com.example.cv.entity.Kurslar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface KurslarDao  extends JpaRepository<Kurslar,Integer> {
    List<Kurslar> findAllByProfil_Id(int id);
}

package com.ironhack.demo.repository;

import com.ironhack.demo.model.Grade;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findAll();
    Grade save(Grade grade);
    Optional<Grade> findById(int id);
    void delete(Grade grade);

    List<Grade> findAllByScoreGreaterThan(int score);
    List<Grade> findAllByScoreGreaterThanOrderByStudentName(int score);
    List<Grade> findAllBySectionIdNot(String sectionId);
}

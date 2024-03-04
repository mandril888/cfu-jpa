package com.ironhack.demo.repository;

import com.ironhack.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Optional<Student> findByFirstNameContaining(String firstName);
    Student findByFirstNameLike(String firstName);
    Optional<Student> findByFirstName(String firstName);
}

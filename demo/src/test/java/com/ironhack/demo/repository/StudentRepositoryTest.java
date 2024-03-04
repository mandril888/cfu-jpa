package com.ironhack.demo.repository;

import com.ironhack.demo.model.Student;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    public void setUp() {
        Student student = new Student(1, "Jon", "Brown");
        studentRepository.save(student);
    }

    @AfterEach
    public void shutDown(){
        studentRepository.deleteAll();
    }

    @Test
    public void findAllTest(){
        List<Student> students = studentRepository.findAll();

        assertEquals(1, students.size());
    }

    @Test
    public void findByFirstNameLikeTest(){
        Student student = studentRepository.findByFirstNameLike("Jon");
        assertEquals("Jon", student.getFirstName());
    }

    @Test
    public void findByFirstNameTest(){
        Optional<Student> student = studentRepository.findByFirstName("Jon");
        assertEquals("Jon", student.get().getFirstName());
    }
}
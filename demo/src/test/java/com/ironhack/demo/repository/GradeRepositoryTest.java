package com.ironhack.demo.repository;

import com.ironhack.demo.model.Grade;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GradeRepositoryTest {

    @Autowired
    private GradeRepository gradeRepo;

    private Grade grade1;
    private Grade grade2;

    @BeforeEach
    public void setUp() {
        grade1 = new Grade(1, "Michael Alcocer", "CS103-A", 65);
        gradeRepo.save(grade1);

        grade2 = new Grade(2, "Maya Charlotte", "CS101-A", 98);
        gradeRepo.save(grade2);
    }

    @AfterEach
    public void tearDown() {
        gradeRepo.deleteAll();
    }

    @Test
    public void testFindAll() {
        List<Grade> gradeList = gradeRepo.findAll();
        assertEquals(2, gradeList.size());
    }

//    @Test
//    public void testUpdate() {
//        grade1.setScore(75);
//        gradeRepo.save(grade1);
//
//        Optional<Grade> fromRepo = gradeRepo.findById(12);
//        assertEquals('', fromRepo);
//
//        Optional<Grade> fromRepo = gradeRepo.findById(grade1.getId());
//        assertEquals(grade1, fromRepo.get());
//
//        Optional<Grade> fromRepo = gradeRepo.findById(1);
//        assertEquals(grade1.getId(), fromRepo.get().getId());
//    }

//    @Test
//    public void testDelete() {
//        gradeRepo.delete(grade1);
//        List<Grade> gradeList = gradeRepo.findAll();
//        assertEquals(1, gradeList.size());
//    }

}

package com.ironhack.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="student_name")
    private String studentName;
    @Column(name="section_id")
    private String sectionId;
    private Integer score;

    public Grade() {}

    public Grade(Integer id, String studentName, String sectionId, Integer score) {
        this.id = id;
        this.studentName = studentName;
        this.sectionId = sectionId;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

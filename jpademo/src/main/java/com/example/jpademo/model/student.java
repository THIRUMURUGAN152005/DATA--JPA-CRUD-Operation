package com.example.jpademo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

    @Id
    private int rollno;
    private String name;
    private String gender;
    private String technology;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public student(String technology, String gender, String name, int rollno) {
        this.technology = technology;
        this.gender = gender;
        this.name = name;
        this.rollno = rollno;
    }

    public student() {

    }
}

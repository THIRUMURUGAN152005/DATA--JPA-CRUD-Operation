package com.example.jpademo.service;

import com.example.jpademo.model.student;
import com.example.jpademo.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {

    @Autowired
    studentrepo studentrepo;

    public List<student> getallstud() {
        return studentrepo.findAll();
    }

    public void addstud(student student) {
       studentrepo.save(student);
    }

    public student getstudbyrollno(int rollno) {
         return studentrepo.findById(rollno).orElse(new student());
    }

    public void updatestud(student student) {
           studentrepo.save(student);


    }


    public void delstud(int rollno) {
        studentrepo.deleteById(rollno);
    }

    public void clearstud() {
        studentrepo.deleteAll();
    }
}

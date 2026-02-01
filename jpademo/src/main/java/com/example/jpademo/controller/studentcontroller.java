package com.example.jpademo.controller;

import com.example.jpademo.model.student;
import com.example.jpademo.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentcontroller {

    @Autowired
    studentservice studentservice;
    @GetMapping("/students")
    public List<student> getallstudent(){
          return studentservice.getallstud();
    }

    @GetMapping("/students/{rollno}")
    public student getstudbyrollno(@PathVariable int rollno){
        return studentservice.getstudbyrollno(rollno);
    }
    @PostMapping("/students")
    public String addstudent(@RequestBody student student){
         studentservice.addstud(student);
         return "added";
    }
    @PutMapping("/students")
    public String updatestud(@RequestBody student student){
          studentservice.updatestud(student);
          return "Updated";
    }
    @DeleteMapping("/students/{rollno}")
    public String deletestud(@PathVariable int rollno){
        studentservice.delstud(rollno);
        return "deleted";
    }
    @DeleteMapping("/students/clear")
    public String clearstud(){
        studentservice.clearstud();
        return "cleared";
    }
    @GetMapping("/students/technology/{tech}")
    public List<student>getstudbytechnology(@PathVariable String tech){
        return studentservice.getstudbytech(tech);
    }

    @PostMapping("/students/filter")
    public List<student>getstudentbygenderandtechnology(@Param("gender") String gender,
                                                        @Param("technology") String technology){

        return studentservice.getstudbygenderandtech(gender,technology);
    }

}

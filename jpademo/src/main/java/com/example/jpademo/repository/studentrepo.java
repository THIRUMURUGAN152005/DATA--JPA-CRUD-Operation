package com.example.jpademo.repository;


import com.example.jpademo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentrepo extends JpaRepository<student,Integer> {

}

package com.example.jpademo.repository;


import com.example.jpademo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentrepo extends JpaRepository<student,Integer> {

   List<student> findBytechnology(String tech);


   @Query(nativeQuery = true,
          value = "SELECT *FROM student WHERE gender=:gender AND technology=:technology"
   )
   List<student>findBygenderAndtechnology(
           @Param("gender") String gender,@Param("technology") String technology
   );

}
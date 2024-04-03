package com.sims.CampusMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sims.CampusMate.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    
}
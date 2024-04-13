package com.sims.CampusMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.sims.CampusMate.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    @Query("SELECT u FROM Student u WHERE u.id > ?1")
    List<Student> findByIdGreaterThan(int id);

    @Query("SELECT u FROM Student u WHERE u.firstName= :fn")
    public Student findByFn(String fn);

    @Query("SELECT u FROM Student u WHERE u.id = :id")
    public Student findByUserId(int id);

    @Query(value = "SELECT s FROM  Student s JOIN s.address a WHERE a.city like %:city%")
    public List<Student> findByCity(String city);

    
}
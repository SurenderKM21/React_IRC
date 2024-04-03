package com.sims.CampusMate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sims.CampusMate.model.Student;
import com.sims.CampusMate.service.StudentService;

import java.util.List;

@RestController
public class StudentController 
{
    @Autowired
    StudentService ss;

    @PostMapping("/post")
    public ResponseEntity<Student> add(@RequestBody Student u)
    {
        Student newuser = ss.create(u);
        return new ResponseEntity<>(newuser,HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity <List<Student>> getAllUsers()
    {
        List<Student>obj = ss.getAlldetails();
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }

    @PutMapping("/putstudent/{userId}")
    public ResponseEntity<Student> putMethodName(@PathVariable("userId") int id, @RequestBody Student employee) 
    {
        if(ss.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deletestudent/{studentId}")
    public ResponseEntity<String> delete(@PathVariable("studentId") int id)
    {
        if(ss.deleteUser(id) == true)
        {
            return new ResponseEntity<>("Deleted Student successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("Couldn't delete student",HttpStatus.NOT_FOUND);
    }

    @PatchMapping("/patchstudent/{studentId}")
    public ResponseEntity<Student> patchMethodName(@PathVariable("studentId") int id, @RequestBody Student updatedStudent)
    {
        Student patchedStudent = ss.patchDetails(id, updatedStudent);
        if(patchedStudent != null) 
        {
            return new ResponseEntity<>(patchedStudent, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}

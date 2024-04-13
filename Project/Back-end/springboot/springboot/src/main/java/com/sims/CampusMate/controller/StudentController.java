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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sims.CampusMate.model.*;
import com.sims.CampusMate.service.StudentService;

import org.springframework.data.domain.Page;
import java.util.List;


@RestController
public class StudentController 
{
    @Autowired
    StudentService ss;

    @GetMapping("/getByPagination")
    public ResponseEntity<Page<Student>> getUsers(
            @RequestParam(defaultValue = "1") int pageNo,
            @RequestParam(defaultValue = "1") int pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
        @RequestParam(defaultValue = "asc") String sortOrder
    ) {
        Page<Student> users = ss.getUsers(pageNo, pageSize,sortBy, sortOrder);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getFirstName/{fn}")
    public ResponseEntity<?> getfn(@PathVariable("fn") String fn )
    {
        try{
            return new ResponseEntity<>(ss.findByfirstName(fn),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    

    // @PostMapping("/course")
    // public ResponseEntity<Course> addCourse(@RequestBody Course course) {
    //     Course newCourse = ss.createCourse(course);
    //     return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
    // }
    @PostMapping("/post")
    public ResponseEntity<String> add(@RequestBody Student u)
    {
        ss.create(u);
        return new ResponseEntity<>("New Student Added Successfully",HttpStatus.CREATED);
    }
    @GetMapping("/getbycity/{city}")
    public ResponseEntity<?> getcity(@PathVariable("city") String s)
    {
        return new ResponseEntity<>(ss.findByCity(s),HttpStatus.OK);
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
    // @DeleteMapping("/deleteAll")
    // public ResponseEntity<String> deleteAllStudents() {
    //     if (ss.deleteAllUsers()) {
    //         return new ResponseEntity<>("All Students deleted successfully", HttpStatus.OK);
    //     }
    //     return new ResponseEntity<>("Couldn't delete all students", HttpStatus.INTERNAL_SERVER_ERROR);
    // }

    @GetMapping("/getstudent/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") int id) {
        Student student = ss.getUserById(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
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

    @GetMapping("/getgreater/{id}")
    public ResponseEntity<?> getgreaterid(@PathVariable("id") int id)
    {
        return new ResponseEntity<>(ss.getGreaterThanId(id),HttpStatus.OK);
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

package com.sims.CampusMate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sims.CampusMate.model.Student;
import com.sims.CampusMate.repository.StudentRepo;

@Service
public class StudentService {
    
    @Autowired
    StudentRepo sr;
    
    public Student create(Student uu)
    {
        return sr.save(uu);
    }

    public List <Student> getAlldetails()
    {
        return sr.findAll();
    }
    public boolean exists(int id) {
        return sr.existsById(id);
    }
    public Student getUserById(int id)
    {
        return sr.findById(id).orElse(null);
    }

    public boolean updateDetails(int id,Student u)
    {
        if(this.getUserById(id)==null)
        {
            return false;
        }
        try{
            sr.save(u);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public Student patchDetails(int id, Student updatedStudent)
     {
        Student existingStudent = sr.findById(id).orElse(null);

        if (existingStudent != null) 
        {
            // Update fields if they are not null in the updatedStudent
            if (updatedStudent.getFirstName() != null) {
                existingStudent.setFirstName(updatedStudent.getFirstName());
            }
            if (updatedStudent.getLastName() != null) {
                existingStudent.setLastName(updatedStudent.getLastName());
            }
            if (updatedStudent.getEmail() != null) {
                existingStudent.setEmail(updatedStudent.getEmail());
            }
            if (updatedStudent.getUserName() != null) {
                existingStudent.setUserName(updatedStudent.getUserName());
            }
            if (updatedStudent.getPassword() != null) {
                existingStudent.setPassword(updatedStudent.getPassword());
            }
            if (updatedStudent.getId() != 0) {
                existingStudent.setId(updatedStudent.getId());
            }
            
            return sr.save(existingStudent);
        }
        return null;
    }

    public boolean deleteUser(int id)
    {
        if(this.getUserById(id) == null)
        {
            return false;
        }
        sr.deleteById(id);
        return true;
    }
    


}
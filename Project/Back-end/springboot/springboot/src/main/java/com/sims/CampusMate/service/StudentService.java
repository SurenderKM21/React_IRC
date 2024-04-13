package com.sims.CampusMate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort;


import com.sims.CampusMate.model.*;
import com.sims.CampusMate.repository.*;

@Service
public class StudentService {
    
    @Autowired
    StudentRepo sr;

    @Autowired
    private AddressRepo ar;

    public Address createAddress(Address address)
    {
        return ar.save(address);
    }

    //PAGINATION AND SORTING
    public Page<Student> getUsers(int pageNo, int pageSize, String sortBy, String sortOrder) 
    {
        Direction direction = sortOrder.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, Sort.by(direction, sortBy));
        return sr.findAll(pageable);
    }


    public List<Student> findByCity(String s)
    {
        return sr.findByCity(s);
    }

    public Student create(Student uu)
    {
        return sr.save(uu);
    }
    

    public List <Student> getAlldetails()
    {
        return sr.findAll();
    }

    public boolean exists(int id) 
    {
        return sr.existsById(id);
    }

   
    public Student getUserById(int id)
    {
        return sr.findByUserId(id);
    }
    public Student findByfirstName(String s)
    {
        return sr.findByFn(s);
    }
    public List<Student> getGreaterThanId(int id)
    {
        return sr.findByIdGreaterThan(id);
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
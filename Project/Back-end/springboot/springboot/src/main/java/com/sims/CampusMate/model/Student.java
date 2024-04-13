package com.sims.CampusMate.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;

    
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL ,fetch=FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonManagedReference
    private Address address; // One-to-One Relationship
    
    public Student(int id, String firstName, String lastName, String email, String userName, String password,
            Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Student() {
    }
    public Student(int id,String firstName, String lastName, String email, String userName, String password) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    
}
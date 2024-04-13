package com.sims.CampusMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.sims.CampusMate.model.*;

public interface AddressRepo extends JpaRepository<Address, Integer> {
    
    // @Query(value = "SELECT a FROM Address a WHERE a.city like %:city%")
    // public List<Address> findByCity(String city);
}
package com.sims.CampusMate.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sims.CampusMate.repository.AddressRepo;
import com.sims.CampusMate.model.Address;

@Service
public class AddressService 
{
    
    @Autowired
    private AddressRepo ar;
    
    public Address createAddress(Address a)
    {
        return ar.save(a);
    }

    public List<Address> getAddress()
    {
        return ar.findAll();
    }

    // public List<Address> findByCity(String s)
    // {
    //     return ar.findByCity(s);
    // }
}

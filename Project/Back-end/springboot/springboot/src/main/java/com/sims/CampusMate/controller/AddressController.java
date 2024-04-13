package com.sims.CampusMate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sims.CampusMate.model.Address;
import com.sims.CampusMate.service.AddressService;

@RestController
public class AddressController 
{
    @Autowired
    private AddressService as;

    // @PostMapping(post"/addres")
    // public ResponseEntity<Address> addAddress(@RequestBody Address address) {
    //     Address newAddress = as.createAddress(address);
    //     return new ResponseEntity<>(newAddress, HttpStatus.CREATED);
    // }   
    
    // @GetMapping("/getbycity/{city}")
    // public ResponseEntity<?> getcity(@PathVariable("city") String s)
    // {
    //     return new ResponseEntity<>(as.findByCity(s),HttpStatus.OK);
    // }
    @PostMapping("/postadd")
    public ResponseEntity<String> add(@RequestBody Address u)
    {
        as.createAddress(u);
        try{
        return new ResponseEntity<>("New Address Added Successfully",HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>("No student data found with given id",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getaddress")
    public ResponseEntity<?> getAddress()
    {
        try{
        return new ResponseEntity<>(as.getAddress(), HttpStatus.CREATED);
    } 
    catch(Exception e)
    {
        return new ResponseEntity<>(HttpStatus.IM_USED);
    }
}
}

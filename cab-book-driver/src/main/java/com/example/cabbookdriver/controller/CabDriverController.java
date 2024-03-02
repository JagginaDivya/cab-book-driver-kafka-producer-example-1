package com.example.cabbookdriver.controller;

import com.example.cabbookdriver.service.CabDriverLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CabDriverController {

    @Autowired
    CabDriverLocationService cabDriverLocationService;
    @PutMapping("/getLocation")
    public ResponseEntity updateLocation()
    {
        int range = 5;
        while(range>0)
        {
            cabDriverLocationService.updateLocation("Location : "+Math.random());
            range--;
        }
        return new ResponseEntity<>(Map.of("message","Location updated"),HttpStatus.OK);
    }
}

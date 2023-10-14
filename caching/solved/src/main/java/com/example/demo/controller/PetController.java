package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(path = "/pets")
public class PetController {
    private int counter = 1;
    @GetMapping("latest")
    @Cacheable(value = "latestPet")
    public ResponseEntity<String> latestPet() {

// Step-1 /////////////////////
//        System.out.println("API was called");
//        return new ResponseEntity<>("mumu",HttpStatus.OK);
//////////////////////////////w

// Step-2 /////////////////////
//        var counterResponse = String.valueOf(counter++);
//        return new ResponseEntity<>(counterResponse,HttpStatus.OK);
//////////////////////////////

// Step-3 /////////////////////
        var counterResponse = String.valueOf(counter);
        return new ResponseEntity<>(counterResponse,HttpStatus.OK);
//////////////////////////////
    }

// Step-3 /////////////////////
    @Autowired
    private CacheManager cacheManager;
    @PostMapping
    public ResponseEntity<String> addPet() {
        Objects.requireNonNull(cacheManager.getCache("latestPet")).clear();
        counter++;
        return new ResponseEntity<>("done",HttpStatus.OK);
    }
//////////////////////////////
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class PetService {
    private int counter = 1;

    @Cacheable(cacheNames = "count")
    public String count() {
        return String.valueOf(this.counter);
    }
    @CacheEvict(cacheNames = "count")
    public void addPet() {
        this.counter++;
    }
}

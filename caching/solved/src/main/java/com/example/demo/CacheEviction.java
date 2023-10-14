package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Configuration
@EnableScheduling
public class CacheEviction {
    @Autowired
    private CacheManager cacheManager;

// Step-3 /////////////////////
//    @Scheduled(fixedRate = 10000)
//    public void evictAllCachesAtIntervals() {
//        System.out.println("remove cache");
//        this.cacheManager.getCacheNames()
//                .forEach(cacheName -> Objects.requireNonNull(cacheManager.getCache(cacheName)).clear());
//    }
//////////////////////////////
}

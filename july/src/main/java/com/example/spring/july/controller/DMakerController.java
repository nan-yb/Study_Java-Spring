package com.example.spring.july.controller;

import com.example.spring.july.service.DmakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {

    private final DmakerService dMakerService;


    @GetMapping("/developers")
    public List<String> getAllDevelopers(){
        log.info("GET /developers HTTP/1.1");

        return Arrays.asList("snow" , "Elsa" , "Olaf");
    }


    @GetMapping("/create-developers")
    public List<String> createAllDevelopers(){
        log.info("GET /create-developers HTTP/1.1");

        dMakerService.createDeveloper();

        return Arrays.asList("Olaf");
    }
}

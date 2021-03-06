package com.edusol.seconddemo.controller;

import com.edusol.seconddemo.dto.Customer;
import com.edusol.seconddemo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController

@Slf4j
public class TestController {
    @Autowired
    private TestService testService;
    int i;
    @GetMapping("/get")
    public ArrayList<Customer> helloWord()
    {
        log.info("Inside TestController");

        return testService.getHelloWorld();
    }
}

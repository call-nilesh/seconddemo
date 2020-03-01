package com.edusol.seconddemo.service;

import com.edusol.seconddemo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class TestService {
    public ArrayList<Customer> getHelloWorld()
    {
        log.info("Inside Service ");
        ArrayList al=new ArrayList();
        al.add(new Customer(15,"nilesh","hinjawadi"));
        al.add(new Customer(15,"Nitin","Pune"));
        al.add(new Customer(15,"Didi","Mauli Krupa Nivas"));


        return al;

    }
}

package com.example.demo.service;

import com.example.demo.repository.MyRepository;
import module.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Component
public class MyService {

    @Autowired
    MyRepository myRepository;

    public List<Index> searchIndex(String input){

        return myRepository.findIndex(input);
    }

    public List<Index> all(){

        return myRepository.findAll();
    }
}
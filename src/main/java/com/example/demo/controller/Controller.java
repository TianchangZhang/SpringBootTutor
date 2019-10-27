package com.example.demo.controller;

import com.example.demo.modal.Course;
import com.example.demo.service.CourseService;
import com.example.demo.service.MyService;
import module.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// single function interface
@RestController
@RequestMapping
public class Controller {

    @Autowired // IOC 控
    CourseService courseService;
    MyService myService; // Singleton

    @GetMapping(path = "/find/{inputString}", produces = "application/json")
    public HttpEntity<Index> searchCourse(@PathVariable("inputString") String inputString) {

        List<Index> findIndex = myService.searchIndex(inputString);
        return new ResponseEntity(findIndex, HttpStatus.OK);
    }
}


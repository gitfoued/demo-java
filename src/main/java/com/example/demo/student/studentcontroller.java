package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="v1/etudiant")
public class studentcontroller {
    private final studentservice studentservice;
@Autowired
    public studentcontroller(com.example.demo.student.studentservice studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<student> getstudents(){
        return studentservice.getstudents();
    }
}

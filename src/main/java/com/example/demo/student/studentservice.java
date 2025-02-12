package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentservice {
    public List<student> getstudents(){
        return List.of(
                new student(1L,
                        "John",
                        "Doe@gmail.com",
                        LocalDate.of(2000, Month.FEBRUARY,6),
                        21
                ));
    }
}

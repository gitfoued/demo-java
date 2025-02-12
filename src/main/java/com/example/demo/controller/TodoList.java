package com.example.demo.controller;


import com.example.demo.entities.TaskList;
import com.example.demo.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoList {

    private final TodoService todoService;
    private static final Logger logger= LoggerFactory.getLogger(TodoList.class);
    @Autowired
    public TodoList(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping("/{name}")
    public Optional<TaskList> getTodo(@PathVariable String name){
        return  this.todoService.getTask((name));
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Integer id){
        this.todoService.deleteTask(id);
    }
}

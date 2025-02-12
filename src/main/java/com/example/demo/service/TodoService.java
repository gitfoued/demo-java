package com.example.demo.service;


import com.example.demo.Repository.TaskListRepository;
import com.example.demo.entities.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    private final TaskListRepository  taskListRepository;
    @Autowired
    public TodoService(TaskListRepository taskListRepository) {
      this.taskListRepository = taskListRepository;
    }
   public TaskList addTask(TaskList taskList) {
        return taskListRepository.save(taskList);
   }
   public Optional<TaskList> getTask(String name) {
        return taskListRepository.findByName(name);
   }
   public void deleteTask(Integer id) {
        this.taskListRepository.deleteById(id);
   }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")

public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/fetchAll")
    public List<Todo> getAllTasks(){
        return service.getAllTasks();
    }

    //get task by id
    @GetMapping("/fetch{id}")
    public Todo getTaskById(@PathVariable Long id){
        return service.getTaskById(id);
    }

    //add task
    @PostMapping("/new")
    public Todo saveTask(Todo todo){
        return service.saveTask(todo);
    }

    // update task
    @PutMapping("/update/{id}")
    public Todo updateTask(Long id , Todo todo){
            return service.updateTask(id,todo);
    }

    //    delete task
    @DeleteMapping("/delete/{id}")
    public String deleteTask(Long id){
        service.deleteTask(id);
        return "deleted Task";
    }

}

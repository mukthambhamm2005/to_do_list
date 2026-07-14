package com.example.demo;

//import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    //get all task
    public List<Todo> getAllTasks(){
        return repository.findAll();
    }
    //get task by id
    public Todo getTaskById(Long id){
        return repository.findById(id).orElse(null);
    }
    //add task
    public Todo saveTask(Todo todo){
        return repository.save(todo);
    }
    // update task
    public Todo updateTask(Long id , Todo todo){
        Todo existing = repository.findById(id).orElse(null);
        if(existing!=null){
            existing.setTask(todo.getTask());
            existing.setCompleted(todo.isCompleted());
            return repository.save(existing);
        }
        return null;
    }
    //    delete task
    public void deleteTask(Long id){
        repository.deleteById(id);
    }
}

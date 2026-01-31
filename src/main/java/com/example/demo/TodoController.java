package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    List<Todo> list;

    public TodoController(){
        Todo todolist1 = new Todo(1,"aditya@gmail.com","Completed");
        Todo todolist2 = new Todo(2,"monu@gmail.com","Not Completed");
        list = new ArrayList<>();
        list.add(todolist1);
        list.add(todolist2);
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return list;
    }

    @PostMapping("/todo")
    public Todo createTodo(@RequestBody Todo newTodo){
        list.add(newTodo);
        return newTodo;
    }

}

package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    List<Todo> list;

    public TodoController(){
        Todo todolist1 = new Todo(1,"aditya@gmail.com","Completed");
        Todo todolist2 = new Todo(2,"monu@gmail.com","Not Completed");
        list = new ArrayList<>();
        list.add(todolist1);
        list.add(todolist2);
    }

    @GetMapping("/")
    public List<Todo> getTodos(){
        return list;
    }

    @PostMapping("todo")
    public Todo createTodo(@RequestBody Todo newTodo){
        list.add(newTodo);
        return newTodo;
    }

    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable int todoId){
        for (Todo todo : list){
            if (todo.getId() == todoId){
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{todoId}")
    public ResponseEntity<Todo> updateTodoById(@PathVariable int todoId, @RequestBody Todo newTodo){
        System.out.println(newTodo);
        for (Todo todo : list){
            if (todo.getId() == todoId){
                todo.setEmail(newTodo.getEmail());
                todo.setId(newTodo.getId());
                todo.setTask(newTodo.getTask());
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{todoId}")
    public ResponseEntity<Todo> deleteById(@PathVariable int todoId){
         for (Todo todo : list){
             if (todo.getId() == todoId){
                 list.remove(todo);
                return ResponseEntity.ok(todo);
             }
         }
         return ResponseEntity.notFound().build();
    }



}

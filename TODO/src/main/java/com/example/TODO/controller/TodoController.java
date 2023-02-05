package com.example.TODO.controller;

import com.example.TODO.model.Todo;
import com.example.TODO.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// create,delete,update,fetch TODO

@RestController
@RequestMapping("/api/v1/todo-app")

public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService)
    {
        this.todoService=todoService;
    }
    @PostMapping
    public void addTodo(@RequestBody Todo todo)
    {

    }
    @GetMapping
    public Todo findTodoById(@PathVariable int id)
    {
        return null;
    }
    @GetMapping("find-all")
    public List<Todo> findAllTodos()
    {
        return todoService.findAll();
    }

    @PutMapping
    public void updateTodo(@PathVariable int id,@RequestBody Todo todo)
    {

    }

    @DeleteMapping
    public void deleteTodo(@PathVariable int id)
    {

    }
}

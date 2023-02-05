package com.example.TODO.service;

import com.example.TODO.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount=0;

    static
    {
        todos.add(new Todo(++todoCount,"Hotel Grandiose",false));
        todos.add(new Todo(++todoCount,"Hotel JW Mariot",false));
        todos.add(new Todo(++todoCount,"Hotel Taj",false));
        todos.add(new Todo(++todoCount,"Hotel Maharaja",false));
        todos.add(new Todo(++todoCount,"Hotel Mayfair",false));
    }

    public List<Todo> findAll()
    {
        return todos;
    }

}

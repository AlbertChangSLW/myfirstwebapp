package com.albertchang.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Albert", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "Albert", "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "Albert", "Learn Full Stack Development", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

}

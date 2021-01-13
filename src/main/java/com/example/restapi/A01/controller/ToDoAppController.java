package com.example.restapi.A01.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController // Scanning looking for endpoints for rest api
@RequestMapping(value = "/todo")
public class ToDoAppController {

    private Map<Integer, String> todos = new HashMap<>();

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping()
    public void add(String todo) {
        todos.put(1, todo);
    }

    @PutMapping()
    public void update(Integer position, String todo) {
        todos.put(position, todo);
    }

    @GetMapping
    public String get() {
        return todos.getOrDefault(1, "[]");
    }

    @DeleteMapping
    public void delete(Integer position) {
        todos.remove(position);
    }

}

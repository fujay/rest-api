package com.example.restapi.A01.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController // Scanning looking for endpoints for rest api
@RequestMapping(value = "/todo")
public class ToDoAppController {

    private Map<Integer, String> todos = new HashMap<>();

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping()
    public Integer add(@RequestParam(value = "todo", defaultValue = "Something") String task) {
        //todos.put(1, task);
        Integer newPosition = todos.entrySet().stream().map(Map.Entry::getKey).reduce(Integer::max).orElse(0) + 1;
        todos.put(newPosition, task);
        return newPosition;
    }

    @PutMapping()
    public void update(Integer position, String todo) {
        todos.put(position, todo);
    }

    @GetMapping
    public String get() {
        // return todos.getOrDefault(1, "[]");
        return todos.entrySet().stream().map(it -> String.format("%s %s - ", it.getKey(), it.getValue())).collect(Collectors.joining());
    }

    @DeleteMapping
    public void delete(Integer position) {
        todos.remove(position);
    }

}

package com.example.restapi.A01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // Scanning looking for endpoints for rest api
@RequestMapping(value = "/")
public class ToDoAppController {

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping("todo")
    public void add(String todo) {
        System.out.println(todo);
    }

}

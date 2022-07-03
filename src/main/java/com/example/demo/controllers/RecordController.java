package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;

@RestController()
@RequestMapping("record")
public class RecordController {

    @Autowired
    UserService userService;

    @GetMapping("/show/{name}")
    public String showString(@PathVariable String name){
        return "====" + name;
    }

    @PostMapping("/add")
    public Users addUser(@RequestBody Users users){
        return userService.saveUser(users);
    }

}

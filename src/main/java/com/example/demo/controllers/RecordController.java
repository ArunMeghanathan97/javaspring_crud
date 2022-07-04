package com.example.demo.controllers;

import java.util.List;

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

    /**
     * add user method
     * @param users
     * @return Users
     */
    @PostMapping("/add")
    public Users addUser(@RequestBody Users users){
        return userService.saveUser(users);
    }

    /**
     * fin user by id method
     * @param id
     * @return Users
     */
    @GetMapping("/find/{id}")
    public Users findUser(@PathVariable int id){
        return userService.findUser(id);
    }

    /**
     * fin user by name method
     * @param name
     * @return Users
     */
    @GetMapping("/find/name/{name}")
    public Users findUserByName(@PathVariable String name){
        return userService.findUserByName(name);
    }

    /**
     * get users list method
     * @return array
     */
    @GetMapping("/list")
    public List<Users> userList(){
        return userService.getUserList();
    }

    /**
     * delete user by id
     * @param id
     * @return string
     */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return this.userService.deleteUser(id);
    }

}

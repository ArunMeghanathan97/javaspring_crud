package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UserService {
    
    @Autowired
    private UsersRepository usersRepository;

    public Users saveUser(Users users){
        return this.usersRepository.save(users);
    }

}

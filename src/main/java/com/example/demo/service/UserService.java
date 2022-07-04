package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UserService {
    
    @Autowired
    private UsersRepository usersRepository;

    /**
     * Save user data to db
     * @param users
     * @return Users
     */
    public Users saveUser(Users users){
        return this.usersRepository.save(users);
    }

    /**
     * find user by id
     * @param id
     * @return user/null
     */
    public Users findUser(int id){
        return this.usersRepository.findById(id).orElse(null);
    }

     /**
     * find user by name
     * @param id
     * @return user/null
     */
    public Users findUserByName(String name){
        return this.usersRepository.findByName(name);
    }

    /**
     * get all users list
     * @return array
     */
    public List<Users> getUserList(){
        return this.usersRepository.findAll();
    }

    /**
     * delete by id
     * @param id
     * @return array
     */
    public String deleteUser(int id){
        this.usersRepository.deleteById(id);
        return "User deleted " + id;
    }

}

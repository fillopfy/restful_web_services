package com.fillopfy.rest.project.controller;

import com.fillopfy.rest.project.entities.User;
import com.fillopfy.rest.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users/")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }


    @PutMapping("/users/user/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

    @GetMapping("/users/byusername/{username}")
    public User getUserByUserName(@PathVariable("username") String userName){
        return userService.getUserByUserName(userName);
    }
}

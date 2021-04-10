package com.fillopfy.rest.project.service;

import com.fillopfy.rest.project.entities.User;
import com.fillopfy.rest.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //get All users
    public List<User> getAllUsers(){
        try{
            return userRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    //create user
    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    public User updateUser(Long id, User user) {
        user.setId(id);
        userRepository.save(user);
        return user;
    }

    public void  deleteUser(Long id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }
    }

    public User getUserByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}

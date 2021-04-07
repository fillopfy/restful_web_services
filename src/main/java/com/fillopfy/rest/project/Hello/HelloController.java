package com.fillopfy.rest.project.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloController {
//    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping("/hello1")
    public String helloController(){
        return "Hello Controllers 111";
    }

    @GetMapping("/hello-user")
    public UserDetails helloUser(){
        return new UserDetails("Abhishek", "Tiwari", "Dhanbad");
    }
}

package com.userService.userService.controllers;


import com.userService.userService.repositories.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/id")
    public User userDetails(Long id){
        return new User();
    }

}

package com.dolovers.springmvcrest.controllers;

import com.dolovers.springmvcrest.domain.User;
import com.dolovers.springmvcrest.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AuthController.BASE_URL)
public class AuthController {
    public static final String BASE_URL = "/api/v1/auth";

    @Autowired
    AuthService authService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user){
        return authService.saveUser(user);
    }

    @GetMapping
    List<User> getAllUsers(){
        return authService.findAllUsers();
    }


}

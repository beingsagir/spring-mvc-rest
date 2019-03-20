package com.dolovers.springmvcrest.services;

import com.dolovers.springmvcrest.domain.User;
import com.dolovers.springmvcrest.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImplementation implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}


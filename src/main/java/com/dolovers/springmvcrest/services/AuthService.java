package com.dolovers.springmvcrest.services;

import com.dolovers.springmvcrest.domain.Customer;
import com.dolovers.springmvcrest.domain.User;

import java.util.List;

public interface AuthService {

    User saveUser(User user);

    List<User> findAllUsers();
}

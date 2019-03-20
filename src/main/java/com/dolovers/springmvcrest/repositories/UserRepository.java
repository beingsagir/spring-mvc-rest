package com.dolovers.springmvcrest.repositories;

import com.dolovers.springmvcrest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

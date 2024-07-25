package com.spring.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.first.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {

    
} 
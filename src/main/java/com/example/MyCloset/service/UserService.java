package com.example.MyCloset.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyCloset.model.User;

public interface UserService extends JpaRepository<User, Integer>{
    
}

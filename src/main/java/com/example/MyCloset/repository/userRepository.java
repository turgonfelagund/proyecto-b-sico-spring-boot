package com.example.MyCloset.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.MyCloset.model.User;

@Repository
public interface userRepository extends CrudRepository<User, Integer>  {
    
}

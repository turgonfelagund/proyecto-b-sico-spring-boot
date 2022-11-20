package com.example.MyCloset.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.MyCloset.model.User;
import com.example.MyCloset.repository.userRepository;

@Service
public class UserServiceImpl {
 
    @Autowired
    private userRepository repo;

    @Value("${ejemplo.name}") //variable extraída de application.properties
    private String ejemploName;

    @Value("${ejemplo.version}") //variable extraída de application.properties
    private int ejemploVersion;

    public User create(User theUser){
        return repo.save(theUser);
    }

    public List<User> listUsers(){
        return (List<User>)repo.findAll();
    }

    public Optional<User> getById(int id){ //Con opcional se pueden evitar errores de null pointer exception en caso de que no se encuentren usuarios
        return repo.findById(id);
    }

    public boolean deleteUserById(int id){
        try {
            repo.deleteById(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}

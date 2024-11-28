package com.nomad.temppo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nomad.temppo.model.User;
import com.nomad.temppo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void create(User user) {
        if (user.getAge() >= 18) {
            repository.create(user);
        }

    }

    public User find(Long id) {
        return repository.find(id);
    }

    public void update(Long id, User userToUpdate) {
        User user = repository.find(id);
        user.setAge(userToUpdate.getAge());
        user.setEmail(userToUpdate.getEmail());
        user.setName(userToUpdate.getName());

    }

    public void delete(Long id) {
        repository.delete(id);

    }
}
package com.nomad.temppo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nomad.temppo.model.User;
import com.nomad.temppo.repository.UserRepository;
import com.nomad.temppo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public void create(@RequestBody User user) {
        userService.create(user);

    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/{id}")
    public ResponseEntity<List> find(@PathVariable Long id) {
        userService.find(id);
        return ResponseEntity.ok(null);

    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody User user) {
        userService.update(id, user);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();

    }

}

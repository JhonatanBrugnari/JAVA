package com.nomad.temppo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.nomad.temppo.model.User;

@Repository
public class UserRepository {

    public List<User> userList = new ArrayList<>();

    public void create(User user) {
        userList.add(user);
    }

    public User find(Long id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst().get();
    }

    public void delete(Long id) {
        User user = find(id);
        userList.remove(user);
    }

}

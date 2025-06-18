package com.example.userapi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.userapi.model.User;

@Service
public class UserService {

    private final Map<Long, User> users = new HashMap<>();
    private long nextId = 1;

    // Obtener todos los usuarios
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    // Obtener un usuario por ID
    public User findById(Long id) {
        return users.get(id);
    }

    // Crear un nuevo usuario
    public User save(User user) {
        user.setId(nextId++);
        users.put(user.getId(), user);
        return user;
    }

    // Eliminar un usuario
    public void delete(Long id) {
        users.remove(id);
    }

}

package com.example.springboot_maven_test.controller;

import com.example.springboot_maven_test.mapper.UserMapper;
import com.example.springboot_maven_test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/user/")
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @GetMapping("/user/{id}")
    public List<User> getUserById(@PathVariable int id) {
        User user = userMapper.selectUserById(id);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return userList;
    }
}

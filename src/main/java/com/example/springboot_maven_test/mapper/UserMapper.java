package com.example.springboot_maven_test.mapper;

import com.example.springboot_maven_test.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAllUser();
    User selectUserById(int id);
    void insertUser(User user);
}

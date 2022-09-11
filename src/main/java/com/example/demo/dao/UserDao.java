package com.example.demo.dao;

import com.example.demo.dto.UserRegisterRequest;
import com.example.demo.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}

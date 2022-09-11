package com.example.demo.service;

import com.example.demo.dto.UserRegisterRequest;
import com.example.demo.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}

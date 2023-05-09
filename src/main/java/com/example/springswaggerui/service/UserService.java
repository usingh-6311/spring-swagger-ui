package com.example.springswaggerui.service;

import com.example.springswaggerui.dto.CreateUserRequest;
import com.example.springswaggerui.dto.UpdateUserRequest;
import com.example.springswaggerui.model.User;

public interface UserService {

    User getUserById(Long id);

    boolean deleteUserById(Long id);

    User updateUser(Long id, UpdateUserRequest request);

    User createUser(CreateUserRequest request);
}

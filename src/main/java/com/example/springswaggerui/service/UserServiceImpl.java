package com.example.springswaggerui.service;

import com.example.springswaggerui.dto.CreateUserRequest;
import com.example.springswaggerui.dto.UpdateUserRequest;
import com.example.springswaggerui.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public boolean deleteUserById(Long id) {
        return false;
    }

    @Override
    public User updateUser(Long id, UpdateUserRequest request) {
        return null;
    }

    @Override
    public User createUser(CreateUserRequest request) {
        return null;
    }
}

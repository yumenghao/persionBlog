package com.yyy.blog.service.impl;

import com.yyy.blog.mapper.UserRepository;
import com.yyy.blog.model.User;
import com.yyy.blog.service.UserService;
import com.yyy.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}

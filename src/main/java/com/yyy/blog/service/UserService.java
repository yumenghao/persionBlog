package com.yyy.blog.service;

import com.yyy.blog.model.User;

public interface UserService {

    User checkUser(String username, String password);
}

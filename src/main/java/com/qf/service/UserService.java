package com.qf.service;

import com.qf.pojo.User;

public interface UserService {
    User selectUserByEmailAndPassword(User user);

    User selectUserByEmail(String email);

    Boolean insertUser(User user);

    Boolean updateUser(User user);
}

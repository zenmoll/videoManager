package com.qf.dao;

import com.qf.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserByEmailAndPassword(User user);

    User selectUserByEmail(String email);

    Boolean insertUser(User user);

    Boolean updateUser(User user);

}

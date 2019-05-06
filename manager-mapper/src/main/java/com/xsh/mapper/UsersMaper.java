package com.xsh.mapper;

import com.xsh.mapper.pojo.Users;

import java.util.List;

public interface UsersMaper {

    void insertUser(Users users);

    List<Users> selectUserAll();
}

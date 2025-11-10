package com.siri.springboot.service;

import com.siri.springboot.bean.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);

    User getUserByName(String name);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}

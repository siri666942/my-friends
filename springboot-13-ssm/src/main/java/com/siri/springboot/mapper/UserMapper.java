package com.siri.springboot.mapper;

import com.siri.springboot.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);


    int insertSelective(User record);
    @Select("select * from user where name='${name}'")
    User selectByName(String name);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user")
    List<User> selectAll();
}
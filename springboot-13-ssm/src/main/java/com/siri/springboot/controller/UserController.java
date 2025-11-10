package com.siri.springboot.controller;

import com.siri.springboot.bean.User;
import com.siri.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    //查询所有
    @GetMapping
    public List<User> selectALl(){
        return userService.selectAll();
    }
    //按id查找
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    //按姓名查找
    @GetMapping("/name/{name}")
    public User getUserByName(@PathVariable("name")String name ){
        return userService.getUserByName(name);
    }
    //按id删除
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        int result = userService.deleteByPrimaryKey(id);
        if(result>0){
            return "删除成功";
        }else{
            return "删除失败,用户不存在";
        }
    }
    //新增用户
    @PostMapping
    public String insert(@RequestBody User user){
        int i = userService.insertSelective(user);
        if(i>0){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }
    //更新
    @PutMapping
    public String update(@RequestBody User user){
        int i = userService.updateByPrimaryKeySelective(user);
        if(i>0){
            return "更改成功";
        }else {
            return "更改失败";
        }
    }





}
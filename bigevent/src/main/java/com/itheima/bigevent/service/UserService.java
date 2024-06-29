package com.itheima.bigevent.service;

import com.itheima.bigevent.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    //根据用户名查询用户
    User findByUserName(String username);


    void register(String username,String password);
}

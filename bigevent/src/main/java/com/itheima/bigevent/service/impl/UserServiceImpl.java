package com.itheima.bigevent.service.impl;

import com.itheima.bigevent.mapper.UserMapper;
import com.itheima.bigevent.pojo.User;
import com.itheima.bigevent.service.UserService;
import com.itheima.bigevent.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u=userMapper.findByUserName(username);
        System.out.println(u);
        return u;
    }

    @Override
    public void register(String username, String password) {
        //加密
        String m5String=Md5Util.getMD5String(password);
        //添加
        userMapper.add(username,m5String);
    }
}

package com.itheima.bigevent.controller;


import com.itheima.bigevent.pojo.Result;
import com.itheima.bigevent.pojo.User;
import com.itheima.bigevent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired//自动注入
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username,String password){
        //查询用户

        User u=userService.findByUserName(username);
        System.out.println(u);
        if (u==null){
            //没有占用
            userService.register(username,password);
            return Result.success();
        }
        else {
            //占用
            return Result.error("用户已被占用");
        }
    }
}

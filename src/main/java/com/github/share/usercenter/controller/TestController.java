package com.github.share.usercenter.controller;

import com.github.share.usercenter.dao.user.UserMapper;
import com.github.share.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @GetMapping("/test")
    public User testInsert() {
        User user = new User();
        user.setAvatarUrl("xxx");
        user.setWxNickname("kim");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        userMapper.insertSelective(user);
        return user;
    }
}

package com.zhifa.chatapp.controller;

import com.zhifa.chatapp.domain.FriendsRequest;
import com.zhifa.chatapp.domain.Users;
import com.zhifa.chatapp.mapper.FriendsRequestMapper;
import com.zhifa.chatapp.mapper.UsersMapper;
import com.zhifa.chatapp.result.JSONResult;
import com.zhifa.chatapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("u")
public class UserController {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private FriendsRequestMapper friendsRequestMapper;

    @Autowired
    private UserService userService;

    @PostMapping("/registOrLogin")
    public JSONResult registOrLogin(@RequestBody Users user) {
// 1. 判断用户名是否存在，如果存在就登录，如果不存在则注册
        boolean usernameIsExist = userService.queryUsernameIsExist(user.getUserName());

        Users userResult = null;
        if (usernameIsExist) {
            // 1.1 登录
            userResult = userService.queryUserForLogin(user.getUserName(),user.getPassword());
            if (userResult == null) {
                return JSONResult.errorMsg("用户名或密码不正确...");
            }
        } else {
            // 1.2 注册
            user.setNickName(user.getUserName());
            user.setPassword(user.getPassword());
            userResult = userService.saveUser(user);
        }

        return JSONResult.ok(userResult);
    }

    @GetMapping("/get")
    public JSONResult f(){
        Date start = new Date();
        List<FriendsRequest> friendsRequests = friendsRequestMapper.searchByDate(start);
        return JSONResult.ok(friendsRequests);
    }

}

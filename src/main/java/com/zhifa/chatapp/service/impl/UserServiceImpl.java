package com.zhifa.chatapp.service.impl;

import com.zhifa.chatapp.domain.Users;
import com.zhifa.chatapp.mapper.UsersMapper;
import com.zhifa.chatapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean queryUsernameIsExist(String userName) {
        Users users = usersMapper.queryUsernameIsExist(userName);
        if (!ObjectUtils.isEmpty(users)) {
            return true;
        }
        return false;
    }

    @Override
    public Users queryUserForLogin(String userName, String password) {
        Users users = usersMapper.queryUserForLogin(userName, password);
        return users;
    }

    @Override
    @Transactional
    public Users saveUser(Users user) {
        usersMapper.insert(user);
        return user;
    }
}

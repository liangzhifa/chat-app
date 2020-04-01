package com.zhifa.chatapp.service;

import com.zhifa.chatapp.domain.Users;

public interface UserService {

    boolean queryUsernameIsExist(String userName);

    Users queryUserForLogin(String userName, String password);

    Users saveUser(Users user);
}

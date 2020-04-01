package com.zhifa.chatapp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.chatapp.domain.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper extends BaseMapper<Users> {
    Users queryUsernameIsExist(@Param("userName") String userName);

    Users queryUserForLogin(@Param("userName") String userName, @Param("password") String password);
}

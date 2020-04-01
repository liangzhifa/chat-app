package com.zhifa.chatapp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifa.chatapp.domain.FriendsRequest;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface FriendsRequestMapper extends BaseMapper<FriendsRequest> {
    List<FriendsRequest> searchByDate(@Param("start") Date start);
}

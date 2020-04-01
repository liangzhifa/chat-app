package com.zhifa.chatapp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName(value = "MY_FRIENDS")
public class MyFriends implements Serializable {
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "MY_USER_ID")
    private Long myUserId;

    @TableField(value = "MY_FRIEND_USER_ID")
    private Long myFriendUserId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_MY_USER_ID = "MY_USER_ID";

    public static final String COL_MY_FRIEND_USER_ID = "MY_FRIEND_USER_ID";
}

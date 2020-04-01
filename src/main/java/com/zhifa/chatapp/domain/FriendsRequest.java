package com.zhifa.chatapp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName(value = "FRIENDS_REQUEST")
public class FriendsRequest implements Serializable {
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "SEND_USER_ID")
    private Long sendUserId;

    @TableField(value = "ACCEPT_USER_ID")
    private Long acceptUserId;

    @TableField(value = "REQUEST_DATE_TIME")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date requestDateTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_SEND_USER_ID = "SEND_USER_ID";

    public static final String COL_ACCEPT_USER_ID = "ACCEPT_USER_ID";

    public static final String COL_REQUEST_DATE_TIME = "REQUEST_DATE_TIME";
}

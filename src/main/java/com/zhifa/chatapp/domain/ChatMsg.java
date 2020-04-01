package com.zhifa.chatapp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName(value = "CHAT_MSG")
public class ChatMsg implements Serializable {
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "SEND_USER_ID")
    private Long sendUserId;

    @TableField(value = "ACCEPT_USER_ID")
    private Long acceptUserId;

    @TableField(value = "MSG")
    private String msg;

    @TableField(value = "SIGN")
    private Short sign;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_SEND_USER_ID = "SEND_USER_ID";

    public static final String COL_ACCEPT_USER_ID = "ACCEPT_USER_ID";

    public static final String COL_MSG = "MSG";

    public static final String COL_SIGN = "SIGN";

    public static final String COL_CREATE_TIME = "CREATE_TIME";
}

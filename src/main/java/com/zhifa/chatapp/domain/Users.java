package com.zhifa.chatapp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@ToString
@TableName(value = "USERS")
public class Users implements Serializable {
    /**
     * 自增主键
     */
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "USER_NAME")
    private String userName;

    @TableField(value = "PASSWORD")
    private String password;

    @TableField(value = "FACE_IMAGE")
    private String faceImage;

    @TableField(value = "NICK_NAME")
    private String nickName;

    @TableField(value = "QRCODE")
    private String qrcode;

    @TableField(value = "CID")
    private String cid;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_USER_NAME = "USER_NAME";

    public static final String COL_PASSWORD = "PASSWORD";

    public static final String COL_FACE_IMAGE = "FACE_IMAGE";

    public static final String COL_NICK_NAME = "NICK_NAME";

    public static final String COL_QRCODE = "QRCODE";

    public static final String COL_CID = "CID";
}

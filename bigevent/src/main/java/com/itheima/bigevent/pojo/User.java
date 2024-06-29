package com.itheima.bigevent.pojo;

import java.time.LocalDateTime;
import lombok.Data;
//lombok 在编译阶段，为实体类自动生成

@Data
public class User {

    private int id;//主键 id
    private String username; //用户名
    private String password;//密码
    private String nickname;//签名
    private String email;//邮箱
    private String userPic;//头像路径
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}

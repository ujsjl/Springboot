package com.itheima.bigevent.pojo;

import java.time.LocalDateTime;
import lombok.Data;
//lombok 在编译阶段，为实体类自动生成

@Data
public class Article {

    private Integer id;//主键 id
    private String title; //文章题目
    private String content;//文章内容
    private String coverImg;//封面路径
    private String state;//文章状态
    private Integer categoryID;//文章类型id
    private Integer createUser;//创建人id
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
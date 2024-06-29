package com.itheima.bigevent.pojo;

import java.time.LocalDateTime;
import lombok.Data;
//lombok 在编译阶段，为实体类自动生成

@Data
public class Category {

    private Integer id;//主键 id
    private String categoryName; //分类名称
    private String categoryAlias;//分类别称
    private Integer createUser;//创建人id
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
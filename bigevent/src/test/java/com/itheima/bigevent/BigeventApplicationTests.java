package com.itheima.bigevent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class BigeventApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() throws Exception {
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }



}

package com.jiafupeng.test;

import org.springframework.jdbc.support.JdbcUtils;

/**
 * @author jiafupeng
 * @create 2020/5/27 13:37
 * @desc
 **/
public class MainTest {

    public static void main(String[] args) {
        System.out.println("aaa");
        JdbcUtils.closeConnection(null);
        System.out.println("bbb");
    }
}

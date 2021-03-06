package com.jiafupeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiafupeng
 * @create 2020/5/25 16:37
 * @desc
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.jiafupeng.mapper"})
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
}

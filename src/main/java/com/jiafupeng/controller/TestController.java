package com.jiafupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author jiafupeng
 * @create 2020/5/25 16:36
 * @desc
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/ping")
    public String ping(){
        return new Date().toString();
    }
}

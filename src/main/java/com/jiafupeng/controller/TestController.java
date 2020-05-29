package com.jiafupeng.controller;

import com.jiafupeng.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiafupeng
 * @create 2020/5/25 16:36
 * @desc
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Resource
    private TestMapper testMapper;

    private final static Logger logaa = org.slf4j.LoggerFactory.getLogger(TestController.class);

    @GetMapping("/ping")
    public Object ping(){
        log.debug("我是 debug");
        log.info("我是 info");
        List<String> list = testMapper.selectAll("csrcFisp");
        return list;
    }
}

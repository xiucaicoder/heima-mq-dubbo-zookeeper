package com.xiucai.producer.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xiucai
 * @date 2023/4/19 17:04
 * @description
 */
@Slf4j
@RestController
public class MyController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/test1")
    public void test1() {
        rocketMQTemplate.convertAndSend("springboot-mq","hello springboot rocketmq");
        log.info("来啦，老弟～");
    }

}

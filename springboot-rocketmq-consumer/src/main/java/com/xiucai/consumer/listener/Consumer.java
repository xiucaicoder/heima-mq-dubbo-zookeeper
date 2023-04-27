package com.xiucai.consumer.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxiulin
 * @date 2023/4/20 20:22
 * @description mq的消费者
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "springboot-mq", consumerGroup = "${rocketmq.producer.group}")
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("Receive message：" + message);
    }
}
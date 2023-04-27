package cn.xiucai.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xiucai.dubbo.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private IUserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return userService.sayHello(name);
    }

}
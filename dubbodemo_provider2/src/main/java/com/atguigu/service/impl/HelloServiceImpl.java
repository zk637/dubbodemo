package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;

@Service //是Dubbo框架提供的注解。用于发布指定的服务到注册中心(zookeeper)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("name = 8089");
        return "8089Hello "+ name;
    }
}

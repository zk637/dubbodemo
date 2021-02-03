package com.atguigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 等价于@Controller+@ResponseBody
@RequestMapping("/demo")
public class HelloController {

    //@Autowired //从当前应用IOC容器中注入bean对象
    //@Reference //引用远程服务对象（从Zookeeper中订阅服务），进行远程调用
    @Reference(loadbalance = "roundrobin") //默认 random
    HelloService helloService; //代理对象

    @RequestMapping("/hello")
    public String sayHello(String name){
        String string = helloService.sayHello(name); //调用远程接口  RPC
        return  string;
    }
}

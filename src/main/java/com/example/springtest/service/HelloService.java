package com.example.springtest.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloService {
    //一个service会有很多的dao
    //服务怎么映射到这
    //restful 服务的控制器，我们要知道这个服务是哪个连接映射过来的
    //当用户访问..../example 时，这是springboot处理的  继续输入/api/hello，那么这个请求就会由这个controller处理
    //controller里有很多方法，再次映射
    @RequestMapping(value="say/{name}",method = RequestMethod.GET)
    //{}是参数
    public String hello(@PathVariable String name){
        return "your name is"+name;
    }
}

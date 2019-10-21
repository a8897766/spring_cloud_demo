package com.wl.ribbonserver.controller;

import com.wl.ribbonserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: Administrator
 * @Date: 2019/10/10 15:44
 * @Version: 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String  hi(String name){
        return helloService.hiService(name);
    }
}

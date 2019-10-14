package com.wl.ribbonserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: holleService
 * @Description: TODO
 * @Author: Administrator
 * @Date: 2019/10/10 15:41
 * @Version: 1.0
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String  hiService(String name){
        return restTemplate.getForObject("http://SERVER-PRODUCER/hi?name="+name,Object.class).toString();
    }

    public String hiError(String name){
        return name+"废了";
    }
}

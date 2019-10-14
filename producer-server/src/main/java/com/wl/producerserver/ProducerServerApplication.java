package com.wl.producerserver;

import com.wl.producerserver.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProducerServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProducerServerApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hi")
    @ResponseBody
    public Object hi(String name){
        User user = new User();
        user.setName(name);
        user.setAge(11);
        Map map = new HashMap();
        map.put("user",user);
        map.put("port",port);
        return map;
    }

}

package com.wl.producerserver.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: Administrator
 * @Date: 2019/10/10 16:03
 * @Version: 1.0
 **/
public class User implements Serializable {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

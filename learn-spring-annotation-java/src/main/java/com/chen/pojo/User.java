package com.chen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component：是由spring提供的，所以如果需要使用Java来配置容器的话，就不需要写
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("cccxh")
    public void setName(String name) {
        this.name = name;
    }



}

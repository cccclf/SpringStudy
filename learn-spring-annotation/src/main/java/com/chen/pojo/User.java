package com.chen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于在bean文件中： <bean id="user" class="com.chen.pojo.User"/>
//@Component 组件
@Component
public class User {

//    @Value("cccxh")
    public String name;

    @Value("cccxh")
    public void setName(String name) {
        this.name = name;
    }
}

package com.chen.config;


import com.chen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//@Configuration代表这是一个配置类，就和之前写的beans.xml一样
@Configuration//这个也会被Spring容器托管，注册到容器中，因为它本来就是一个@Component
//@ComponentScan("com.chen.pojo")//扫描包
@Import(MyConfig2.class)
public class MyConfig {

    //表示当前方法交给Bean管理，相当于我们之前写的一个bean
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }

}

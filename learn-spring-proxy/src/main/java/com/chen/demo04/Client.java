package com.chen.demo04;

import com.chen.demo02.UserService;
import com.chen.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，利用代理工具类生成代理类
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置要代理的对象
        proxyInvocationHandler.setTarget(userService);
        //动态生成代理类proxy
        UserService proxy = (UserService)proxyInvocationHandler.getProxy();
        proxy.delete();
    }
}

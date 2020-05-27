package com.chen.service;

import com.chen.dao.UserDao;
import com.chen.dao.UserDaoImpl;
//业务层接口实现类
public class UserServiceImpl implements UserService{

    //private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;//利用set注入，不需要再由程序员去创建对象，由客户端自主控制，实现控制反转

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

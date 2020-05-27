package com.chen.mapper;

import com.chen.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//方式2
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}

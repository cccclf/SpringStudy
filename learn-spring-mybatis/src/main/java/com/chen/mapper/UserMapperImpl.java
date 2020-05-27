package com.chen.mapper;

import com.chen.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

//方式1
public class UserMapperImpl implements UserMapper {
    //以前的所有操作，都使用sqlSession来执行，现在使用sqlSessionTemplate；
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}

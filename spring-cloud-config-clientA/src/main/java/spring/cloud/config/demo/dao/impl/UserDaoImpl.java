package spring.cloud.config.demo.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import spring.cloud.config.demo.dao.BaseDao;
import spring.cloud.config.demo.dao.UserDao;
import spring.cloud.config.demo.domain.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User selectOne(User user) throws Exception {
        return this.getSqlSession().selectOne("com.java.dao.UserMapper.selectOne", user);
    }

    @Override
    public List selectList(User user) throws Exception {
        return (List) this.getSqlSession().selectList("com.java.dao.UserMapper.selectOne", user);
    }



}

package spring.cloud.config.demo.dao;

import java.util.List;

import spring.cloud.config.demo.domain.User;

public interface UserDao {
    public User selectOne(User user) throws Exception;

    public List selectList(User user) throws Exception;
}

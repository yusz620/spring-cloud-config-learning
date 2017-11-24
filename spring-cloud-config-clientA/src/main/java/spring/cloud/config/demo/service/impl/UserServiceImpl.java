package spring.cloud.config.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.cloud.config.demo.dao.UserDao;
import spring.cloud.config.demo.domain.User;
import spring.cloud.config.demo.service.UserService;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectOne(User user) throws Exception {
        return this.userDao.selectOne(user);
    }

    @Override
    public List<User> selectList(User user) throws Exception {
        return this.userDao.selectList(user);
    }
}

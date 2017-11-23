package spring.cloud.config.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.cloud.config.demo.dao.UserDao;
import spring.cloud.config.demo.service.UserService;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
}

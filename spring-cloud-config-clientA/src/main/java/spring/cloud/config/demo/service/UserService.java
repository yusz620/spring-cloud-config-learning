package spring.cloud.config.demo.service;

import java.util.List;

import spring.cloud.config.demo.domain.User;

public interface UserService {
    public User selectOne(User user) throws Exception;

    public List<User> selectList(User user) throws Exception;
}

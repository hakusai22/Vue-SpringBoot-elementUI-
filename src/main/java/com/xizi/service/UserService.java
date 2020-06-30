package com.xizi.service;

import com.xizi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    //查询所有的用户信息
    List<User> findAll();

    //保存用户信息
    void save(User user);


    //删除用户
    void delete(String id);


    //更新用户信息
    void update(User user);

    //分页查询
    List<User> findByPage( Integer pageNow, Integer rows);

    //查询总条数
    Long findTotals();
}

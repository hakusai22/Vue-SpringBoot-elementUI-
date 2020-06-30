package com.xizi.dao;

import com.xizi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    //查询所有的用户信息
    List<User> findAll();

    //保存用户信息
    void save(User user);

    //删除用户
    void delete(String id);

    //更新用户信息
    void update(User user);

    //分页查询
    List<User> findByPage(@Param("start") Integer start,@Param("rows") Integer rows);

    //查询总条数
    Long findTotals();

}

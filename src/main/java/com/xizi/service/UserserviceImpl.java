package com.xizi.service;

import com.xizi.dao.UserDao;
import com.xizi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@Service
@Transactional
public class UserserviceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
//    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> findByPage(Integer pageNow, Integer rows) {
        int start =(pageNow-1)*rows;
        return userDao.findByPage(start,rows);
    }

    @Override
    public Long findTotals() {
        return userDao.findTotals();
    }
}

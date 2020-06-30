package com.xizi;

import com.xizi.pojo.User;
import com.xizi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TestUserService {
    @Autowired
   private UserService userService;

    @Test
    public void testFindAll(){
        userService.findAll().forEach(user ->System.out.println("user"+user));

    }

    @Test
    public void testSave(){
        User user = new User();
        user.setName("xizi2222");
        user.setBir(new Date());
        user.setSex("男");
        user.setAddress("江西省南昌市");
        userService.save(user);

    }
}

package com.xizi.controller;

import com.alibaba.druid.util.StringUtils;
import com.xizi.vo.Result;
import com.xizi.pojo.User;
import com.xizi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@CrossOrigin(allowCredentials="true")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody User user){
        Result result = new Result();
        System.out.println(user.getName());
        try {
            if (StringUtils.isEmpty(user.getId())){
                System.out.println(user.getId());
                userService.save(user);
                result.setMsg("用户信息保存成功");
            }else{
                userService.update(user);
                result.setMsg("用户信息更新成功");
            }

        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("系统错误：保护用户信息失败，请稍后重试....");
        }
        return result;
    }
    @GetMapping("delete")
    public Result delete(String id){
        Result result = new Result();
        try {
            userService.delete(id);
            result.setMsg("删除用户信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("删除用户信息失败");
            result.setStatus(false);
        }
        return result;
    }

//分页查询
    @GetMapping("findByPage")
    public Map<String,Object> findByPage(Integer pageNow,Integer pageSize){
        HashMap<String, Object> result = new HashMap<>();
        pageNow=pageNow==null?1:pageNow;
        pageSize=pageSize==null?4:pageSize;
        List<User> users = userService.findByPage(pageNow, pageSize);
        Long totals = userService.findTotals();
        result.put("users",users);
        result.put("total",totals);
        return result;
    }



}

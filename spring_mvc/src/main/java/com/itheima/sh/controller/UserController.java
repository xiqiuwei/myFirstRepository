package com.itheima.sh.controller;

import com.itheima.sh.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("findAll")
    public String findAllUser(Model model){
        List<User> list = new ArrayList<>();
        for (int i = 0 ; i <10 ; i ++){
            User user = new User();
            user.setAge(12+i);
            user.setHobby(new String[] {"篮球","足球","排球"});
            user.setIncome(1000.0+i);
            user.setIsMarry(true);
            user.setUsername("三土"+i+1);
            list.add(user);
        }
        model.addAttribute("list",list);
        //返回视图名称
        return "user";
    }
}

package com.itheima.sh.controller;

import com.itheima.sh.domain.User;
import com.itheima.sh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户数据
     * @return
     */
    @RequestMapping("list")
    public String list(Model model){
        List<User> allUsers = userService.findAllUsers();
        model.addAttribute("users",allUsers);
        return "users";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping("toAdd")
    public String toAdd(){
        return "userAdd";
    }


    /**
     * 用户保存
     * @param user
     * @return
     */
    @RequestMapping("save")
    public String save(User user){
        userService.saveUser(user);
        return "redirect:/user/list";
    }
}


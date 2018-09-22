package com.itheima.sh.controller;

import com.itheima.sh.domain.User;
import com.itheima.sh.domain.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController2 {
    @RequestMapping("show250")
    public ModelAndView test25090(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello2");
        mv.addObject("msg","23333333");
        return mv;
    }

    @RequestMapping("show5/{id}/{name}")
    public ModelAndView test1(@PathVariable("id")Long id, @PathVariable("name")String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello2");
        mv.addObject("msg","占位符id:"+id+"占位符name:"+name);
        return mv;
    }
    /**
     * 通配一个字符
     * @return
     */
    @RequestMapping("sss?/show1")
    public ModelAndView test2(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ant风格映射:?");
        mv.setViewName("hello2");
        return mv;
    }

    /**
     * 通配0个或多个字符
     * @return
     */

    @RequestMapping("aa*/show2")
    public ModelAndView test3(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ant风格映射:?");
        mv.setViewName("hello2");
        return mv;
    }

    /**
     * 通配0个或多个路径
     * @return
     */
    @RequestMapping("**/show3")
    public ModelAndView test4(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ant风格映射:?");
        mv.setViewName("hello2");
        return mv;
    }

    /**
     * 接收普通请求参数
     * @return
     */
    @RequestMapping("show18")
    public ModelAndView test18(@RequestParam(value="name",required=false)String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello2");
        mv.addObject("msg", "接收普通请求参数：" + name);
        return mv;
    }
    @RequestMapping("show19")
    public ModelAndView test19(@RequestParam("username")String username, @RequestParam("age")Integer age,
                               @RequestParam("isMarry")Boolean isMarry, @RequestParam("income")Double income,
                               @RequestParam(value = "hobby",required = false)String[] hobby){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello2");
        StringBuffer sb = new StringBuffer();
        sb.append(username+","+age+","+isMarry+","+income);
        if (hobby!= null){
            for (String s:hobby) {
                sb.append(","+s);
            }
        }
        mv.addObject("msg"+"基本数据类型是:"+sb.toString());
        return mv;
    }
    @RequestMapping("show20")
    public ModelAndView test20(User user){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello2");
        mv.addObject("msg","对象接收数据"+user);
        return mv;
    }

    @RequestMapping("show21")
    public ModelAndView test21(UserVO userVO){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello2");
        mv.addObject("msg","对象接收数据"+userVO);
        return mv;
    }

    @RequestMapping("show22")
    public String test22(Model model, @CookieValue("JESSIONID")String jessionId){
        model.addAttribute("msg", "获取cookie,jessionid" + jessionId);
        return "hello2";
    }
    @RequestMapping("show23")
    public String test23(){
        return "forward:/hello/show24.do?type=forward";
    }
    @RequestMapping("show24")
    public String test24(Model model,@RequestParam("type") String type){
        model.addAttribute("msg","转发或重定向 type="+type);
        return "hello2";
    }
    @RequestMapping("show25")
    public String test25(){
        return "redirect:/hello/show24.do?type=redirect";
    }


    @RequestMapping("show26")
    @ResponseBody
    public List<User> test26(){
        List<User> list = new ArrayList<User>();
            User user = new User();
            user.setUsername("三土");
            user.setIsMarry(false);
            user.setIncome(10000.0);
            user.setAge(16);
            user.setHobby(new String[] {"篮球","足球","羽毛球"});
            list.add(user);
        System.out.println(list.get(0));
        return list;
    }

}

package com.itheima.sh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    /**
     * 处理请求
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //添加一个数据,页面上可以取出这个数据
        mv.addObject("msg","这是一个springmvc程序");
        //设置视图的名字
        mv.setViewName("hello2");
        return mv;
    }
}

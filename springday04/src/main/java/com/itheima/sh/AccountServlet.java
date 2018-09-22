package com.itheima.sh;

import com.itheima.sh.domain.Account;
import com.itheima.sh.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AccountServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从ServletContext中获取唯一的IOC容器;
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        //从IOC容器中获取AccountService
        AccountService accountService = (AccountService) ac.getBean("accountService");
        List<Account> allAccount = accountService.findAllAccount();
        req.setAttribute("allAccount",allAccount);
        req.getRequestDispatcher("/account.jsp").forward(req,resp);
    }
}

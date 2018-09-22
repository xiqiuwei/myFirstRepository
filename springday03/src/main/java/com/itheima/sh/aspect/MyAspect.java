package com.itheima.sh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyAspect {
    public void writeLog(){
        System.out.println("记录日志啦.....");
    }

    public void afterReturning(JoinPoint joinPoint,Object result){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(date);
        System.out.println("尊敬的用户您于"+format1+"取款"+result);
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("开启事务");
        //获取目标方法的参数
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            //获取目标的返回值
           result = proceedingJoinPoint.proceed(args);
            System.out.println("提交事务");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("事务回滚");
        }
        return result;
    }

    public void throwing(JoinPoint joinPoint, Throwable throwable){
        System.out.println("注意了,在"+joinPoint.getTarget().getClass().getName()+"类的"+joinPoint.getSignature().getName()+
        "中出现了"+throwable.getMessage()+"异常");

    }

}

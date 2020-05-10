package com.codegym.cms.concern;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class Logger {

    @AfterReturning(pointcut = "execution(public * com.codegym.cms.service.Customer.CustomerService.*(..))")
    public void error(){
        System.out.println("[CMS] ERROR!");
    }
//    public void log(JoinPoint joinPoint,Exception e){
//        String className = joinPoint.getTarget().getClass().getSimpleName();
//        String method = joinPoint.getSignature().getName();
//        String args = Arrays.toString(joinPoint.getArgs());
//        System.out.println(String.format("[CMS] co loi xay ra: %s.%s%s: %s", className, method, args, e.getMessage()));
//    }
}

package com.nitesh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // enables aspect to be executed before addAccount method in any class
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n======>>>> Executing @Before advice on addAccount()");
    }

    // enables aspect to be executed before addAccount method having only Account param
    @Before("execution(* addAccount(com.nitesh.aopdemo.Account))")
    public void beforeAccountAdvice() {
        System.out.println("\n======>>>> Executing @Before advice on addAccount()");
    }
}

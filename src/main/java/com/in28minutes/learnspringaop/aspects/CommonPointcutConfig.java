package com.in28minutes.learnspringaop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig(){}

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){}

    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.data.*.*(..))")
    public void dataPackageConfig(){}

    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBean(){

    }


}

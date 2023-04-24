package com.in28minutes.learnspringaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Configuration
@Configuration
//AOP
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //Pointcut - when?
    // execution(* PACKAGE.*.*(..))
    // execution(* com.in28minutes.learnspringaop.aopexample.business.*.*(..))
    @Before("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        //Logic - what?
        logger.info("Before Aspect - {} is called with arguments: {}", joinPoint, joinPoint.getArgs());
    }
}

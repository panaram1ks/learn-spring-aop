package com.in28minutes.learnspringaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //Start a timer
        long startTimeMillis = System.currentTimeMillis();

        //Execute the method
        Object returnValue = proceedingJoinPoint.proceed();

        //Stop the timer
        long stopTimeMillis = System.currentTimeMillis();
        long executionDuration = stopTimeMillis - startTimeMillis;

        logger.info("Around Aspect - {} Method executed in {} ms", proceedingJoinPoint, executionDuration);
        return returnValue;
    }
}

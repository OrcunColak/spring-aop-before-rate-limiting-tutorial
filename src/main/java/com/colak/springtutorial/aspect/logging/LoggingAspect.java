package com.colak.springtutorial.aspect.logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.colak.springtutorial.controller.*.*(..))")
    public void logBeforeMethod() {
        log.info("Method is about to be executed...");
    }
}

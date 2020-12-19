package com.luv2code.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	// setup logger
	private Logger mylogger = Logger.getLogger(getClass().getName());
	
	// setup pointcut declarations
	
	// add @Before advice
	
	// add@AfterReturning advice

}

package com.xyy.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceMonitor {
	@AfterReturning("execution(* com.xyy.boot.service.impl.*.*(..))")
	public void logServiceAccess(JoinPoint joinPoint) {
		System.out.println("Completed: " + joinPoint);
	}
}

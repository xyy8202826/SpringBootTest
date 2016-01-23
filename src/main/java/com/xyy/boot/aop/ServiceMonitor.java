package com.xyy.boot.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceMonitor {
	private static final Logger logger=LoggerFactory.getLogger(ServiceMonitor.class);
	@AfterReturning("execution(* com.xyy.boot.service.impl.*.*(..))")
	public void logServiceAccess(JoinPoint joinPoint) {
		logger.info("joinPoint.getThis()---------" + joinPoint.getThis());
		logger.info("joinPoint.getTarget()-------" + joinPoint.getTarget());
		logger.info("joinPoint.getSignature()----" + joinPoint.getSignature());
		logger.info("Completed: -----------------" + joinPoint);
		
		
	}
	
	
	@Before("execution(* com.xyy.boot.controller.*.*(..))")
	public void beforController(JoinPoint joinPoint) {
		logger.info("joinPoint.getThis()---------" + joinPoint.getThis());
		logger.info("joinPoint.getTarget()-------" + joinPoint.getTarget());
		logger.info("joinPoint.getSignature()----" + joinPoint.getSignature());
		logger.info("Completed: -----------------" + joinPoint);
	}
	
	
	@Around("@annotation(aspectAnnotation)")
	public Object handAnnotation(ProceedingJoinPoint joinPoint, AspectAnnotation aspectAnnotation) throws Throwable{
		Object[] args = joinPoint.getArgs();
		logger.info("-----------------------aspectAnnotation---------" + joinPoint);
		for(Object arg : args){
			if(arg != null && arg instanceof HttpServletRequest){
				return joinPoint.proceed();
			}
		}
		return joinPoint.proceed();
		
	}
}

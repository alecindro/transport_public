package com.altran.transport.configuration;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.altran.transport.interceptor.TimeMonitorInterceptor;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
	
	@Pointcut("execution(public com.altran.transport.domain.rest.opendata.ResponseRest com.altran.transport.service.OpenDataSetService.getResponse(..))")
    public void opendatasearchMonitor() { }
	
	@Bean
    public TimeMonitorInterceptor timerMonitorInterceptor() {
        return new TimeMonitorInterceptor(true);
    }
    
    @Bean
    public Advisor openDataSearchMonitorMonitorAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("com.altran.transport.configuration.AopConfig.opendatasearchMonitor()");
        return new DefaultPointcutAdvisor(pointcut, timerMonitorInterceptor());
    }

}

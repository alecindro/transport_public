package com.altran.transport.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.altran.transport.interceptor.RequestTimerInterceptor;

@Configuration
public class TimerInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private RequestTimerInterceptor requestTimerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestTimerInterceptor);
    }

}

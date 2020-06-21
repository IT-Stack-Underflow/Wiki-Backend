package com.itstackunderflow.wiki.configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.itstackunderflow.wiki.interceptor.LoggerInterceptor;

public class WebMvcConfiguration implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggerInterceptor());
	}
}

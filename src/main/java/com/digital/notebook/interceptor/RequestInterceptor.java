package com.digital.notebook.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@RequestMapping("/")
public class RequestInterceptor extends HandlerInterceptorAdapter{

	@Override  
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  
			throws Exception { 
		return true;  
	}  

	@Override  
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,  
			ModelAndView modelAndView) throws Exception {  
	}  

	@Override  
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  
			throws Exception {  
	}  


}

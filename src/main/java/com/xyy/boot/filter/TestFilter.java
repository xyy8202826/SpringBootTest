package com.xyy.boot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.stereotype.Component;
@Component
@WebFilter(filterName="TestFilter",urlPatterns="/*")
/**
 * 
    * @ClassName: TestFilter
    * @Description: TODO()
    * @author Administrator
    * @date 2016年1月25日
    * Filter的顺序是按照类名的字母顺序排的
    *
 */
public class TestFilter implements Filter {
	public TestFilter(){
		System.out.println("TestFilter");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		
	}

}

package com.raj.oauth.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class OauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class, args);
    }

//	@Bean
//	public FilterRegistrationBean filterRegistrationBean()
//	{
//		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//		filterRegistrationBean.setFilter(new JwtFilter());
//		filterRegistrationBean.setUrlPatterns(Collections.singleton("/api/hello/*"));
//
//		return filterRegistrationBean;
//	}

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new JwteFilter());
        filterRegistrationBean.setUrlPatterns(Collections.singleton("/api/hello"));
        return filterRegistrationBean;

    }
}

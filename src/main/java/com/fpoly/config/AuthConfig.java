package com.fpoly.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AuthConfig extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		//disable CRSF
		httpSecurity
		        //no authentication needed for these context paths
		        .authorizeRequests()
		        .antMatchers("/error").permitAll()
		        .antMatchers("/error/**").permitAll()
		        .antMatchers("/your Urls that dosen't need security/**").permitAll();
	}
}

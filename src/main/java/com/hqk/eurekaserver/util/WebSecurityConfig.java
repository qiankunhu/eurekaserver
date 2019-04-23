package com.hqk.eurekaserver.util;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

        //禁用csrf攻击功能
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
            http.csrf().disable().httpBasic();
        }

}




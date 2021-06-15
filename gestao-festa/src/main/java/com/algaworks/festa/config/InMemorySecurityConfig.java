package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class InMemorySecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) 
			throws Exception{
		builder.inMemoryAuthentication().withUser("joao").password("$2a$04$ycZVBHUH/9YGGUI1u6vO6OtNadIYTK2enbGnNGwg/fACV5883I.ZG")
		.roles("USER").and()
		.withUser("alexandre").password("$2a$04$ycZVBHUH/9YGGUI1u6vO6OtNadIYTK2enbGnNGwg/fACV5883I.ZG").roles("USER")
		.and()
		.withUser("thiago").password("$2a$04$ycZVBHUH/9YGGUI1u6vO6OtNadIYTK2enbGnNGwg/fACV5883I.ZG").roles("USER");	
	}
}

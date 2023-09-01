package com.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig 
{
	// Using HttpSecurity we can configure which api can 
	// be accessed by whom, whether we want 'form-based' or 
	// 'basic' authentication
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity hs) throws Exception
	{
		
			hs.csrf().disable()
				.authorizeHttpRequests()
					         .requestMatchers("/home/public")
					         .permitAll()
					         .anyRequest()
					         .authenticated()
					         .and()
					         .formLogin();       
					         		
			return hs.build();
			
	}
	
}


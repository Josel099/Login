package com.bmc.LoginAuthenticationBackend;

import com.bmc.LoginAuthenticationBackend.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LoginAuthenticationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAuthenticationBackendApplication.class, args);
	}

}

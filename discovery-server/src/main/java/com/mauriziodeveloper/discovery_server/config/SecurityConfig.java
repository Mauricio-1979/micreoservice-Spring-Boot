package com.mauriziodeveloper.discovery_server.config;

 // filtro de seguridad personalizado en cada uno de los servicios
// en algunos escenarios se puede desabilitar csrf por motivos de conveniencia

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf->csrf.disable());
        return http.build();
    }
}

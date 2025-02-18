package com.example.springbootprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopmentConfiguration {
    @Bean
    public String devBean() {
        return "This is the development bean.";
    }
}

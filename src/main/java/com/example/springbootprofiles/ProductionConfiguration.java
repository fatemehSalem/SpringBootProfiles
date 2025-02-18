package com.example.springbootprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ProductionConfiguration {

    @Bean
    public String productionBean() {
        return "This is the production bean.";
    }
}

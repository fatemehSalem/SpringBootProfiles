package com.example.springbootprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringbootProfilesApplication {
    @Autowired
    private Environment environment;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootProfilesApplication.class, args);

    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            String[] activeProfiles = environment.getActiveProfiles();
            System.out.println("Active Profiles: ");
            for (String profile : activeProfiles) {
                System.out.println(profile);
            }
        };
    }
}

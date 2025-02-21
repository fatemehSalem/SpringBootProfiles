package com.example.springbootprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class SpringbootProfilesApplication {
    @Autowired
    private Environment environment;
    @Autowired
    private  AppConfig appConfig;

/*    @Autowired
    private DevelopmentConfiguration developmentConfiguration;
    @Autowired
    private  ProductionConfiguration productionConfiguration;*/

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProfilesApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            String[] activeProfiles = environment.getActiveProfiles();
            System.out.println("Active Profiles:");
            for (String profile : activeProfiles) {
                System.out.println(profile);
            }

/*            System.out.println("Loaded Bean: " + developmentConfiguration);
            System.out.println("Loaded Bean: " + productionConfiguration);*/

            System.out.println("App Name: " + appConfig.getName());
            System.out.println("App Version: " + appConfig.getVersion());
            System.out.println("FTP Host: " + appConfig.getFtp().getHost());
            System.out.println("FTP Username: " + appConfig.getFtp().getUsername());
            System.out.println("FTP Password: " + appConfig.getFtp().getPassword());
        };
    }
}

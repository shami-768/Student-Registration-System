package com.training;

import com.training.Model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.training")
public class AppConfig {
    @Bean
    public Course getObject(){
        return new Course("Spring Boot ");
    }
}

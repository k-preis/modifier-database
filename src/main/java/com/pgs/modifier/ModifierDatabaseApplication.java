package com.pgs.modifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ModifierDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModifierDatabaseApplication.class, args);
    }
}

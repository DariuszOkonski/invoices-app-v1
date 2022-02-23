package com.example.invoicesappv1.role;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RoleConfig {

    @Bean
    CommandLineRunner commandLineRunner(RoleRepository repository) {
        return args -> {
            Role admin = new Role(
                    "admin",
                    true,
                    true,
                    true,
                    true);

            Role user = new Role(
                    "user",
                    true,
                    true,
                    true,
                    false);

            Role guest = new Role(
                    "guest",
                    true,
                    false,
                    false,
                    false);

            repository.saveAll(
                    List.of(admin, user, guest)
            );
        };
    }
}

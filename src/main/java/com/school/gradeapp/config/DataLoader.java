package com.school.gradeapp.config;

import com.school.gradeapp.model.User;
import com.school.gradeapp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {

            if (userRepository.findByUsername("admin").isEmpty()) {
                User user = new User();
                user.setUsername("admin");
                user.setPassword(passwordEncoder.encode("password")); // ENCRYPTED
                user.setEnabled(true);

                userRepository.save(user);

                System.out.println("Test user 'admin' created");
            }
        };
    }
}

package com.awesome.mytriplist.config;

import com.awesome.mytriplist.repository.TestRepository;
import com.awesome.mytriplist.repository.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyConfig
{
    private final EntityManager em;

    @Bean
    public UserRepository userRepository()
    {
        return new TestRepository(em);
    }
}
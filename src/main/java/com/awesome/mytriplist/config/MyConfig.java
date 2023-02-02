package com.awesome.mytriplist.config;

import com.awesome.mytriplist.repository.UserJpaRepository;
import com.awesome.mytriplist.repository.UserRepository;
import com.awesome.mytriplist.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyConfig
{
    private final UserJpaRepository repository;

    @Bean
    public UserRepository userRepository()
    {
        return new UsersRepository(repository);
    }
}
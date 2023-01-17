package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UserRepository
{
    void save(Users user);

    void update(Users user);

    void delete(Long id);

    Optional<Users> findById(Long id);

    List<Users> findAll();
}
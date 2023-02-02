package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TestRepository implements UserRepository
{
    private final TestJpaRepository testRepositoryV2;

    @Override
    public void save(Users user)
    {
        testRepositoryV2.save(user);
    }

    @Override
    public void update(Users user)
    {
        Users users = testRepositoryV2.findById(user.getId()).orElseThrow();
        users.setAge(user.getAge());
        users.setName(user.getName());
    }

    @Override
    public void delete(Long id)
    {
        Users users = testRepositoryV2.findById(id).orElseThrow();
        testRepositoryV2.delete(users);
    }

    @Override
    public Optional<Users> findById(Long id)
    {
        return testRepositoryV2.findById(id);
    }

    @Override
    public List<Users> findAll()
    {
        return testRepositoryV2.findAll();
    }
}

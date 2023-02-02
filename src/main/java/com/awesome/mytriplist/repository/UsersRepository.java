package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Transactional
public class UsersRepository implements UserRepository
{
    private final UserJpaRepository repository;

    @Override
    public void save(Users user)
    {
        repository.save(user);
    }

    @Override
    public void update(Users user)
    {
        Users users = repository.findById(user.getId()).orElseThrow();
        users.setName(user.getName());
        users.setAge(user.getAge());
    }

    @Override
    public void delete(Long id)
    {
        Users users = repository.findById(id).orElseThrow();
        repository.delete(users);
    }

    @Override
    public Optional<Users> findById(Long id)
    {
        return repository.findById(id);
    }

    @Override
    public List<Users> findAll()
    {
        return repository.findAll();
    }

    public List<Users> findCond()
    {
        return repository.findlimit2();
    }
}

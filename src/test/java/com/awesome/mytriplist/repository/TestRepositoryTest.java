package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@Slf4j
@SpringBootTest
class TestRepositoryTest
{
    @Autowired
    UserRepository repository;

    @Test
    void save()
    {
        Users users = new Users("허준석", 27);
        repository.save(users);

        Optional<Users> user = repository.findById(users.getId());
        log.info("user = {}", user);
    }

    @Test
    void update()
    {
        Users user = new Users(5L, "준석이", 28);
        repository.update(user);

        Optional<Users> result = repository.findById(5L);
        log.info("afterUpdate = {}", result);
    }

    @Test
    void delete()
    {
        List<Users> beforeDelete = repository.findAll();
        log.info("--삭제 전--");
        for(Users users : beforeDelete)
        {
            log.info("{}", users);
        }

        repository.delete(8L);

        List<Users> afterDelete = repository.findAll();
        log.info("--삭제 후--");
        for(Users users : afterDelete)
        {
            log.info("{}", users);
        }
    }

    @Test
    void findById()
    {
        Optional<Users> user = repository.findById(5L);
        log.info("user = {}", user);
    }

    @Test
    void findAll()
    {
        List<Users> list = repository.findAll();
        for(Users users : list)
        {
            log.info("users = {}", users);
        }
    }

    @Test
    void findCond()
    {
        List<Users> list = repository.findCond();
        for(Users users : list)
        {
            log.info("users = {}", users);
        }
    }
}
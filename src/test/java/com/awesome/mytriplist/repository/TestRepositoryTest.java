package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

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
        System.out.println("user = " + user);
    }

    @Test
    void update()
    {
        Users user = new Users(5L, "준석이", 28);
        repository.update(user);

        Optional<Users> result = repository.findById(5L);
        System.out.println("afterUpdate = " + result);
    }

    @Test
    void delete()
    {
        List<Users> beforeDelete = repository.findAll();
        System.out.println("--삭제 전--");
        for(Users users : beforeDelete)
        {
            System.out.println(users);
        }

        repository.delete(1L);

        List<Users> afterDelete = repository.findAll();
        System.out.println("--삭제 후--");
        for(Users users : afterDelete)
        {
            System.out.println(users);
        }
    }

    @Test
    void findById()
    {
        Optional<Users> user = repository.findById(5L);
        System.out.println("user = " + user);
    }

    @Test
    void findAll()
    {
        List<Users> list = repository.findAll();
        for(Users users : list)
        {
            System.out.println(users);
        }
    }
}
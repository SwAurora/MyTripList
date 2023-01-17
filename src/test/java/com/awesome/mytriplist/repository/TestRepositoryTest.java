package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TestRepositoryTest
{

    @Test
    void save()
    {
        Users users = new Users();
        users.setId(1L);
        users.setName("김성욱");
        users.setAge(27);

        Users users2 = new Users();
        users2.setId(2L);
        users2.setName("김성욱2");
        users2.setAge(27);

        Users users3 = new Users();
        users3.setId(3L);
        users3.setName("김성욱3");
        users3.setAge(27);

        List<Users> userList = new ArrayList<>();
        userList.add(users);
        userList.add(users2);
        userList.add(users3);

        for(Users user : userList)
        {
            System.out.println(user);
        }
    }

    @Test
    void update()
    {
    }

    @Test
    void findById()
    {
    }

    @Test
    void findAll()
    {
    }
}
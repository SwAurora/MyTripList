package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Transactional
public class TestRepository implements UserRepository
{
    private final EntityManager em;

    @Override
    public void save(Users user)
    {
        em.persist(user);
    }

    @Override
    public void update(Users user)
    {
        Users findUser = em.find(Users.class, user.getId());
        findUser.setName(user.getName());
        findUser.setAge(user.getAge());
    }

    @Override
    public void delete(Long id)
    {

    }

    @Override
    public Optional<Users> findById(Long id)
    {
        Users user = em.find(Users.class, id);
        return Optional.ofNullable(user);
    }

    @Override
    public List<Users> findAll()
    {
        String sql = "select i from Users i";
        TypedQuery<Users> query = em.createQuery(sql, Users.class);
        return query.getResultList();
    }
}


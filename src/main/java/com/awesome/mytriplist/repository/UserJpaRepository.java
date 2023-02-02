package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<Users, Long>
{
    List<Users> findTop2ByOrderByIdDesc();

    @Query("select i from Users i order by i.id desc limit 3")
    List<Users> findlimit2();
}

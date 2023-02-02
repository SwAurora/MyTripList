package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<Users, Long>
{
}

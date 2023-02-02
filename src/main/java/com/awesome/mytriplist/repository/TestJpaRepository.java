package com.awesome.mytriplist.repository;

import com.awesome.mytriplist.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestJpaRepository extends JpaRepository<Users, Long>
{
}

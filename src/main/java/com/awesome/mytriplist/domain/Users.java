package com.awesome.mytriplist.domain;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@Entity
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    public Users()
    {
    }

    public Users(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Users(Long id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

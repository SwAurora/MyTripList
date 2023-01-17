package com.awesome.mytriplist.domain;

import jakarta.persistence.*;
import lombok.*;


@Data
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
}

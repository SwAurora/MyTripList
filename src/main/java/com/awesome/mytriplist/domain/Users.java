package com.awesome.mytriplist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotNull
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

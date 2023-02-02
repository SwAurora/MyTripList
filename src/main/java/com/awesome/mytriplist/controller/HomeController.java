package com.awesome.mytriplist.controller;

import com.awesome.mytriplist.domain.Users;
import com.awesome.mytriplist.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller("/")
@RequiredArgsConstructor
public class HomeController
{
    private final UserRepository repository;

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("Users") Users users, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return "save";
        }
        repository.save(users);
        Optional<Users> user = repository.findById(users.getId());
        user.ifPresent(value -> model.addAttribute("user", value));
        return "save";
    }

    @GetMapping("/showAll")
    public String selectAll(Model model)
    {
        List<Users> all = repository.findAll();
        model.addAttribute("users", all);
        return "showAll";
    }

    @GetMapping("/hi")
    public String hi()
    {
        return "user/board/list";
    }
}

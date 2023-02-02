package com.awesome.mytriplist;

import com.awesome.mytriplist.config.MyConfig;
import com.awesome.mytriplist.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({MyConfig.class, SecurityConfig.class})
@SpringBootApplication(scanBasePackages = "com.awesome.mytriplist.controller")
public class MyTripListApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MyTripListApplication.class, args);
    }

}
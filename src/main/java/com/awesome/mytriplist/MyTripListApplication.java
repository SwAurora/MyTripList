package com.awesome.mytriplist;

import com.awesome.mytriplist.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyConfig.class)
@SpringBootApplication(scanBasePackages = "com.awesome.mytriplist.controller")
public class MyTripListApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MyTripListApplication.class, args);
    }

}
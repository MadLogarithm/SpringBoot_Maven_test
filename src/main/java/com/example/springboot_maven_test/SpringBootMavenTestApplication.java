package com.example.springboot_maven_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_maven_test.mapper")
public class SpringBootMavenTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMavenTestApplication.class, args);
    }

}

package com.example.mybts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.mybts.mapper")
@SpringBootApplication
public class MybtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybtsApplication.class, args);
    }


}

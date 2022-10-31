package com.example.mybts;

import com.example.mybts.mapper.ClassMapper;
import org.junit.jupiter.api.Test;
import com.example.mybts.model.Class;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes=MybtsApplication.class)


public class ClassMapperTese {
    @Autowired
    ClassMapper classMapper;

    @Test
    void selectLike(){
        Class Class = new Class();
        Class.setName("计");
        Class.setGrade("2");
        Class.setNumber(50);
        System.out.println(classMapper.selectLike(Class));
    }
}

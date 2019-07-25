package com.example.springboot;

import com.example.springboot.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    ApplicationContext context;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        Person person=context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
    }
}

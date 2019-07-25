package com.example.springboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname：person
 * @User: 李小飞
 * @Date: 2019/6/24  Time：9:58
 */
@Data
@Component
//从配置文件中读取指定前缀的内容，注入bean中
//@ConfigurationProperties(prefix = "person")
public class Person {
    @Value("${person.name}")//读取单个数据，注入bean中
    private String name;
    private int age;
    private char sex;
}

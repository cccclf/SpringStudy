package com.chen.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}

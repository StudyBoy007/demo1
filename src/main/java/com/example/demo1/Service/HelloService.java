package com.example.demo1.Service;

import org.springframework.stereotype.Service;

/**
 * Create by czq
 * time on 2020/5/27  18:02
 */
@Service
public class HelloService {
     private String name="666";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String add() {
        return name;
    }

    public HelloService() {
    }

    public HelloService(String name) {
        this.name = name;
    }
}

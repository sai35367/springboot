package com.qulifier.annotation;

import org.springframework.stereotype.Service;

@Service
public class Employee implements Person {

    @Override
    public void work() {
        System.out.println("Employee work");
    }

}

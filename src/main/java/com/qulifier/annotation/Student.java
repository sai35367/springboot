package com.qulifier.annotation;

import org.springframework.stereotype.Service;

@Service
public class Student implements Person {

    @Override
    public void work() {
        System.out.println("student work");
    }

}

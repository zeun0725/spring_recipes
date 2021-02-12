package com.jieun.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.jieun.springrecipes.sequence");

        SequenceDao generator = context.getBean(SequenceDao.class);

        System.out.println(generator.getNextValue("IT"));
        System.out.println(generator.getNextValue("IT"));
    }
}

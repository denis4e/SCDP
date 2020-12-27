package com.sonar.cloud.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScdpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScdpApplication.class, args);
        test();
    }

    private static void test() {
        boolean isEmpty = true;
        if (isEmpty) { // Noncompliant; "a" is always "true"
            System.out.println("TEST MESSAGE!");
        }
        int target = -5;
        int num = 3;

        target =+ num; // Noncompliant; target = 3
        System.out.println(target);

    }

}

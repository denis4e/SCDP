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
        boolean isTrue = true;
        if (isTrue) { // Noncompliant; "a" is always "true"
            System.out.println("TEST MESSAGE EXAMPLE SOURCE!");
        }
        int item = -5;
        int value = 3;

        item =+ value; // Noncompliant; target = 3
        System.out.println(item);

    }

}

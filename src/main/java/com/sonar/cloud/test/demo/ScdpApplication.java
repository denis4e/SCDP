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
        boolean isFlag = true;
        if (isFlag) { // Noncompliant; "a" is always "true"
            System.out.println("TEST MESSAGE EXAMPLE!");
        }
        int a = -5;
        int b = 3;

        a =+ b; // Noncompliant; target = 3
        System.out.println(a);

    }

}

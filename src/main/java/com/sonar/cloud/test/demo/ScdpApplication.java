package com.sonar.cloud.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScdpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScdpApplication.class, args);
        test();
    }

   private static void test(){
        System.out.println("SPRING APP");
    }

}

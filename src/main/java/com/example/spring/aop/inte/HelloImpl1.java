package com.example.spring.aop.inte;

/**
 * @author mengpengfei
 * @create 2023- 05-20-10:08
 */
public class HelloImpl1 implements HelloInterface {
    public void printHello() {
        System.out.println("HelloImpl1.printHello");
    }

    public void doPoint() {
        System.out.println("HelloImpl1.doPoint");
    }
}

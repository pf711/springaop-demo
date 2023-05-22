package com.example.spring.aop.inte;

/**
 * @author mengpengfei
 * @create 2023- 05-20-10:10
 */
public class HelloImpl2 implements HelloInterface {
    public void printHello() {
        System.out.println("HelloImpl2.printHello");
    }

    public void doPoint() {
        System.out.println("HelloImpl2.doPoint");
    }
}

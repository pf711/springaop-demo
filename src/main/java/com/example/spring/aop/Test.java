package com.example.spring.aop;

import com.example.spring.aop.inte.HelloInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args){
        //@SuppressWarnings("resource")
        //如果是web项目，则使用以下代码加载配置文件，如果是一般的Java项目，则使用注释的方式
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");
        //ApplicationContext appCtx = new FileSystemXmlApplicationContext("conf/application.xml");
        HelloInterface hw1 = (HelloInterface) appCtx.getBean("proxy");
        HelloInterface hw2 = (HelloInterface) appCtx.getBean("proxy2");
        hw1.printHello();
        System.out.println();
        hw1.doPoint();
        System.out.println();

        hw2.printHello();
        System.out.println();
        hw2.doPoint();
    }
}
package com.learn.self;

import learn.self.IHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client-self.xml");
        IHello hello= (IHello) context.getBean("hello");
        System.out.println(hello.sayHi("*************坚持************"));
       // System.in.read(); //阻塞当前进程

    }
}

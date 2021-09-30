package com.atguigu.maven;

import org.junit.Test;

/**
 * @author lzystart
 * @create 2021-10-01 1:15
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}

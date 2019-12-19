package com.oyft.springcloud.providerTest;


import org.junit.Test;

public class TestDemo {
    @Test
    public void demo(){
        String a = "abc";
        String b = "abc";
        String c = new String("123");
        String d = new String("123");
        System.out.println(a == b);
        System.out.println(c == d);
    }
}

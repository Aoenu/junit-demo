package com.hand.junit.aoneu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanInjectTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testSayHi() {
        System.out.println(helloService.sayHi());
    }

}
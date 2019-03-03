package com.hand.junit.aoneu.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHi() {
        return "--- Hi ---";
    }

    public String sayHello() {
        return "--- Hello ---";
    }

}
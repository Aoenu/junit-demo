package com.hand.junit.aoneu.service;

import com.hand.junit.aoneu.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.BDDMockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())// 期待返回状态码200
                .andDo(print());// 打印返回的 http response 信息
    }

    @MockBean
    private HelloService helloService;

    @Test
    public void testSayHi() throws Exception {
        when(helloService.sayHi()).thenReturn("=== Hi ===");
        mvc.perform(MockMvcRequestBuilders.get("/hello/sayHi"))
                .andExpect(status().isOk())
                .andDo(print());// 打印返回的 http response 信息
    }

}
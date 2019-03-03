package com.hand.junit.aoneu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;


/**
 * This is Description
 *
 * @author wubaoben
 * @date 2019/03/01
 */
@RunWith(Parameterized.class) //1.更改默认的测试运行器为RunWith(Parameterized.class)
public class ParameterTest {

    // 2.声明变量存放预期值和测试数据
    private String firstName;
    private String lastName;

    //3.声明一个返回值 为Collection的公共静态方法，并使用@Parameters进行修饰
    @Parameterized.Parameters
    public static List<Object[]> param() {
        return Arrays.asList(new Object[][]{{"xiao", "ming"}, {"da", "hong"}});  //两个测试用例
    }

    //4.为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
    public ParameterTest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 5. 测试方法 会将所有测试用例都测试一遍
    @Test
    public void testParameter() {
        String name = firstName + " " + lastName;
        assertThat("xiao ming", is(name));
    }
}

package com.hand.junit.aoneu.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is Description
 *
 * @author wubaoben
 * @date 2019/02/28
 */
@RunWith(Suite.class)  // 1. 更改测试运行方式为 Suite
@Suite.SuiteClasses({TaskOneTest.class, TaskTwoTest.class}) //2. 将测试类传入进来
public class SuitTest {
    /**
     * 测试套件的入口类只是组织测试类一起进行测试，无任何测试方法，
     */
}

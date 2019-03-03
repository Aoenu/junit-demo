package com.hand.junit.aoneu.service;

import com.hand.junit.aoneu.dao.UserRepository;
import com.hand.junit.aoneu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryInMemoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("aoenu");
        userRepository.save(user);
        System.out.println("====================================");
        System.out.println(userRepository.findAll());
        System.out.println("====================================");
    }

}
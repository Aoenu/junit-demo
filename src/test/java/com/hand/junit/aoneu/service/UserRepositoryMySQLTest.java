package com.hand.junit.aoneu.service;

import com.hand.junit.aoneu.dao.UserRepository;
import com.hand.junit.aoneu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositoryMySQLTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Rollback(false)
    public void testSave() {
        User user = new User();
        user.setName("aoenu");
        userRepository.save(user);
        System.out.println("====================================");
        System.out.println(userRepository.findAll());
        System.out.println("====================================");
    }

    @Test
    @Transactional(readOnly = true)
    public void testSelect() {
        System.out.println("====================================");
        System.out.println(userRepository.findAll());
        System.out.println("====================================");
    }

}
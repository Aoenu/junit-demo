package com.hand.junit.aoneu.dao;

import com.hand.junit.aoneu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
package com.soft1851.spring.ioc.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans.xml"})
public class UserLoginTest {
    @Autowired
    private UserLogin userLogin;
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(userLogin.userLogin(user));
    }
}
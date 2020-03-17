package com.soft1851.spring.ioc.entity;

/**
 * @author Tao
 * @version 1.0
 * @ClassName UserLogin
 * @Description TODO
 * @date 2020-03-12 18:50
 **/
public class UserLogin {
    private User user;

    public boolean userLogin(User user) {
        return "admin".equals(user.getAccount()) && "111".equals(user.getPassword());
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

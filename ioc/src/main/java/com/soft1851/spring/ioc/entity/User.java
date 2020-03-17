package com.soft1851.spring.ioc.entity;

/**
 * @author Tao
 * @version 1.0
 * @ClassName User
 * @Description TODO
 * @date 2020-03-12 18:48
 **/
public class User {
    private String account;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
}

package com.demo.thymeleaf.bean;

/**
 * @author Srd
 * @date 2020/8/14  1:47
 */
public class User {
    private String name;
    private int age;
    /**
     * 性别
     * 0男 1女
     */
    private int sex;
    private String role;
    private User friend;

    public User() {
    }

    public User(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User(String name, int age, int sex,String role) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.role = role;
    }

    public User(String name, int age, int sex,String role, User friend) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.role = role;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

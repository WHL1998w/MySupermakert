package com.soft1841.entity;

/**管理员实体类
 *
 */

public class Admin {
    //定义相关属性
    private Long id;
    private String name;
    private String avatar;
    private String password;
    private String number;
    //方法的重载
    public Admin(Long id, String avatar, String password, String number) {
    }
    public Admin(Long id, String name, String avatar, String password, String number) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.password = password;
        this.number = number;
    }
    //提供getter和setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
//to string 方法的重写
    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

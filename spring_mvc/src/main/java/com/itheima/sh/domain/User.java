package com.itheima.sh.domain;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Serializable {

    private String username;
    private Integer age;
    private Boolean isMarry;
    private Double income;
    private String[] hobby;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Boolean getIsMarry() {
        return isMarry;
    }
    public void setIsMarry(Boolean isMarry) {
        this.isMarry = isMarry;
    }
    public Double getIncome() {
        return income;
    }
    public void setIncome(Double income) {
        this.income = income;
    }
    public String[] getHobby() {
        return hobby;
    }
    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", age=" + age + ", isMarry=" + isMarry + ", income=" + income
                + ", hobby=" + Arrays.toString(hobby) + "]";
    }
}
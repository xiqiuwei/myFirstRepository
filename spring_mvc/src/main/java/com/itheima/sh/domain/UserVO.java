package com.itheima.sh.domain;

import java.io.Serializable;
import java.util.List;

public class UserVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<User> users;

    public List<User> getUser() {
        return users;
    }

    public void setUser(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "user=" + users +
                '}';
    }
}
